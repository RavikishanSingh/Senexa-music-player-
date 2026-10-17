package com.ravis.senexa.activities

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.ravis.senexa.adapters.ActivityListSongsItemAdapter
import com.ravis.senexa.databinding.ActivityArtistProfileBinding
import com.ravis.senexa.model.AlbumItem
import com.ravis.senexa.model.BasicDataRecord
import com.ravis.senexa.network.ApiManager
import com.ravis.senexa.network.utility.RequestNetwork
import com.ravis.senexa.records.ArtistSearch
import com.ravis.senexa.utils.MiniPlayerHelper
import com.squareup.picasso.Picasso

class ArtistProfileActivity : AppCompatActivity() {
    private var binding: ActivityArtistProfileBinding? = null
    val songs: MutableList<AlbumItem?> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtistProfileBinding.inflate(layoutInflater)
        setContentView(binding!!.getRoot())
        MiniPlayerHelper.initMiniPlayer(this)

        binding!!.songsRecyclerView.setLayoutManager(LinearLayoutManager(this))

        val dataJson = intent.getStringExtra("data")
        if (dataJson != null) {
            try {
                val record = Gson().fromJson(dataJson, BasicDataRecord::class.java)
                binding!!.name.text = record.title
                if (!record.image.isNullOrEmpty()) {
                    Picasso.get().load(record.image!!.toUri()).into(binding!!.artistImage)
                }
                if (!record.id.isNullOrEmpty()) {
                    loadArtistData(record.id!!)
                }
            } catch (e: Exception) {
                // ignore
            }
        }
    }

    private fun loadArtistData(artistId: String) {
        songs.clear()
        val apiManager = ApiManager(this)
        apiManager.retrieveArtistById(artistId, object : RequestNetwork.RequestListener {
            override fun onResponse(tag: String?, response: String?, responseHeaders: HashMap<String?, Any?>?) {
                try {
                    val artistSearch = Gson().fromJson(response, ArtistSearch::class.java)
                    val topSongs = artistSearch.data?.topSongs ?: emptyList()
                    for (song in topSongs) {
                        if (song == null) continue
                        val imageList = song.image
                        val imageUrl = if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url ?: "" else ""
                        songs.add(AlbumItem(song.name(), song.year, imageUrl, song.id))
                    }
                    val adapter = ActivityListSongsItemAdapter(songs)
                    binding!!.songsRecyclerView.adapter = adapter
                    adapter.notifyDataSetChanged()
                } catch (e: Exception) {
                    Toast.makeText(this@ArtistProfileActivity, "Error loading artist profile", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onErrorResponse(tag: String?, message: String?) {
                Toast.makeText(this@ArtistProfileActivity, message ?: "Network error", Toast.LENGTH_SHORT).show()
            }
        })
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
