package com.ravis.senexa.activities

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.ravis.senexa.adapters.ActivityListSongsItemAdapter
import com.ravis.senexa.databinding.ActivityListBinding
import com.ravis.senexa.model.AlbumItem
import com.ravis.senexa.network.ApiManager
import com.ravis.senexa.network.utility.RequestNetwork
import com.ravis.senexa.records.AlbumSearch
import com.ravis.senexa.records.PlaylistSearch
import com.ravis.senexa.utils.MiniPlayerHelper

class ListActivity : AppCompatActivity() {
    private var binding: ActivityListBinding? = null
    val songs: MutableList<AlbumItem?> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding!!.getRoot())
        MiniPlayerHelper.initMiniPlayer(this)

        binding!!.recyclerView.setLayoutManager(LinearLayoutManager(this))

        val id = intent.getStringExtra("id") ?: ""
        val type = intent.getStringExtra("type") ?: "playlist"
        val dataJson = intent.getStringExtra("data")

        if (dataJson != null) {
            try {
                val albumItem = Gson().fromJson(dataJson, AlbumItem::class.java)
                binding!!.title.text = albumItem.albumTitle()
            } catch (e: Exception) {
                // ignore
            }
        }

        binding!!.refreshLayout.setOnRefreshListener {
            loadData(id, type)
            binding!!.refreshLayout.isRefreshing = false
        }

        loadData(id, type)
    }

    private fun loadData(id: String, type: String) {
        songs.clear()
        val apiManager = ApiManager(this)

        val listener = object : RequestNetwork.RequestListener {
            override fun onResponse(tag: String?, response: String?, responseHeaders: HashMap<String?, Any?>?) {
                try {
                    if (type == "album") {
                        val albumSearch = Gson().fromJson(response, AlbumSearch::class.java)
                        val results = albumSearch.data?.songs ?: emptyList()
                        for (song in results) {
                            if (song == null) continue
                            val imageList = song.image
                            val imageUrl = if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url ?: "" else ""
                            songs.add(AlbumItem(song.name(), song.year, imageUrl, song.id))
                        }
                    } else {
                        val playlistSearch = Gson().fromJson(response, PlaylistSearch::class.java)
                        val results = playlistSearch.data?.songs ?: emptyList()
                        for (song in results) {
                            if (song == null) continue
                            val imageList = song.image
                            val imageUrl = if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url ?: "" else ""
                            songs.add(AlbumItem(song.name(), song.year, imageUrl, song.id))
                        }
                    }
                    val adapter = ActivityListSongsItemAdapter(songs)
                    binding!!.recyclerView.adapter = adapter
                    adapter.notifyDataSetChanged()
                } catch (e: Exception) {
                    Toast.makeText(this@ListActivity, "Error parsing data", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onErrorResponse(tag: String?, message: String?) {
                Toast.makeText(this@ListActivity, message ?: "Network error", Toast.LENGTH_SHORT).show()
            }
        }

        if (type == "album") {
            apiManager.retrieveAlbumById(id, listener)
        } else {
            apiManager.retrievePlaylistById(id, 0, 50, listener)
        }
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
