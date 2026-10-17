package com.ravis.senexa.activities

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.google.gson.Gson
import com.ravis.senexa.adapters.ActivityMainPopularSongs
import com.ravis.senexa.databinding.ActivitySearchBinding
import com.ravis.senexa.model.AlbumItem
import com.ravis.senexa.network.ApiManager
import com.ravis.senexa.network.utility.RequestNetwork
import com.ravis.senexa.records.SongSearch
import com.ravis.senexa.utils.MiniPlayerHelper

class SearchActivity : AppCompatActivity() {
    var binding: ActivitySearchBinding? = null
    private val TAG = "SearchActivity"
    private val searchHandler = Handler(Looper.getMainLooper())
    private var searchRunnable: Runnable? = null
    private var currentQuery: String = ""
    val songs: MutableList<AlbumItem?> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding!!.getRoot())
        MiniPlayerHelper.initMiniPlayer(this)

        binding!!.hscrollview.visibility = View.GONE
        val span = MainActivity.calculateNoOfColumns(this, 180f)
        binding!!.recyclerView.setLayoutManager(GridLayoutManager(this, span))

        binding!!.edittext.requestFocus()

        binding!!.edittext.setOnEditorActionListener { textView: TextView?, _: Int, _: KeyEvent? ->
            showData(textView!!.text.toString())
            hideKeyboard(binding!!.edittext)
            true
        }

        binding!!.edittext.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (s.toString().isEmpty()) {
                    binding!!.clearIcon.visibility = View.GONE
                } else {
                    binding!!.clearIcon.visibility = View.VISIBLE
                }

                searchRunnable?.let { searchHandler.removeCallbacks(it) }
                searchRunnable = Runnable {
                    val query = s.toString().trim()
                    if (query.isNotEmpty()) {
                        showData(query)
                    } else {
                        currentQuery = ""
                        songs.clear()
                        binding!!.recyclerView.adapter = ActivityMainPopularSongs(songs)
                    }
                }
                searchHandler.postDelayed(searchRunnable!!, 500)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        binding!!.clearIcon.setOnClickListener {
            binding!!.edittext.setText("")
        }
    }

    private fun hideKeyboard(view: View) {
        val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager?
        inputMethodManager?.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun showData(query: String) {
        currentQuery = query
        showShimmerData()

        val apiManager = ApiManager(this)
        apiManager.searchSongs(query, 0, 30, object : RequestNetwork.RequestListener {
            override fun onResponse(
                tag: String?,
                response: String?,
                responseHeaders: HashMap<String?, Any?>?
            ) {
                if (query != currentQuery) return
                songs.clear()
                val songSearch = Gson().fromJson(response, SongSearch::class.java)
                if (songSearch.success) {
                    val resultsList = songSearch.data?.results ?: emptyList()
                    for (results in resultsList) {
                        if (results == null) continue
                        val imageList = results.image
                        val imageUrl = if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url ?: "" else ""
                        songs.add(
                            AlbumItem(
                                results.name(), results.language + " " + results.year,
                                imageUrl, results.id
                            )
                        )
                    }
                    val adapter = ActivityMainPopularSongs(songs)
                    binding!!.recyclerView.adapter = adapter
                    adapter.notifyDataSetChanged()
                } else {
                    Toast.makeText(this@SearchActivity, "No results found", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onErrorResponse(tag: String?, message: String?) {
                if (query != currentQuery) return
                Toast.makeText(this@SearchActivity, "Search error", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun showShimmerData() {
        val dataShimmer: MutableList<AlbumItem?> = ArrayList()
        for (i in 0..10) {
            dataShimmer.add(AlbumItem("<shimmer>", "<shimmer>", "<shimmer>", "<shimmer>"))
        }
        binding!!.recyclerView.adapter = ActivityMainPopularSongs(dataShimmer)
    }

    override fun onResume() {
        super.onResume()
        MiniPlayerHelper.onActivityResume(this)
    }

    override fun onPause() {
        super.onPause()
        MiniPlayerHelper.onActivityPause(this)
    }

    fun backPress(view: View?) {
        finish()
    }
}
