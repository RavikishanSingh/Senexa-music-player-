package com.ravis.senexa.activities

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts.RequestPermission
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import com.ravis.senexa.BaseApplicationClass
import com.ravis.senexa.R
import com.ravis.senexa.adapters.ActivityMainAlbumItemAdapter
import com.ravis.senexa.adapters.ActivityMainArtistsItemAdapter
import com.ravis.senexa.adapters.ActivityMainPlaylistAdapter
import com.ravis.senexa.adapters.ActivityMainPopularSongs
import com.ravis.senexa.databinding.ActivityMainBinding
import com.ravis.senexa.model.AlbumItem
import com.ravis.senexa.network.ApiManager
import com.ravis.senexa.network.NetworkChangeReceiver
import com.ravis.senexa.network.NetworkChangeReceiver.NetworkStatusListener
import com.ravis.senexa.network.utility.RequestNetwork
import com.ravis.senexa.records.AlbumsSearch
import com.ravis.senexa.records.ArtistsSearch
import com.ravis.senexa.records.PlaylistsSearch
import com.ravis.senexa.records.SongSearch
import com.ravis.senexa.utils.MusicPlayerManager
import com.yarolegovich.slidingrootnav.SlidingRootNav
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper
import org.json.JSONException
import org.json.JSONObject
import com.ravis.senexa.utils.MiniPlayerHelper

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private var binding: ActivityMainBinding? = null
    private var baseApplicationClass: BaseApplicationClass? = null
    val songs: MutableList<AlbumItem?> = ArrayList<AlbumItem?>()
    val artists: MutableList<ArtistsSearch.Data.Results?> = ArrayList<ArtistsSearch.Data.Results?>()
    val albums: MutableList<AlbumItem?> = ArrayList<AlbumItem?>()
    val playlists: MutableList<AlbumItem?> = ArrayList<AlbumItem?>()

    var networkChangeReceiver: NetworkChangeReceiver =
        NetworkChangeReceiver(object : NetworkStatusListener {
            override fun onNetworkConnected() {
                if (songs.isEmpty() || artists.isEmpty() || albums.isEmpty() || playlists.isEmpty()) showData()
            }

            override fun onNetworkDisconnected() {
                if (songs.isEmpty() || artists.isEmpty() || albums.isEmpty() || playlists.isEmpty()) showOfflineData()
                Snackbar.make(binding!!.getRoot(), "No Internet Connection", Snackbar.LENGTH_LONG)
                    .show()
            }
        })

    private var slidingRootNavBuilder: SlidingRootNav? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.getRoot())

        baseApplicationClass = applicationContext as BaseApplicationClass?
        BaseApplicationClass.currentActivity = this
        BaseApplicationClass.updateTheme()

        slidingRootNavBuilder = SlidingRootNavBuilder(this)
            .withMenuLayout(R.layout.main_drawer_layout)
            .withContentClickableWhenMenuOpened(false)
            .withDragDistance(250)
            .inject()

        updateVersionTextInDrawer()
        setupDrawerClicks()

        binding!!.profileIcon.setOnClickListener {
            slidingRootNavBuilder!!.openMenu(true)
        }

        val span: Int = calculateNoOfColumns(this, 200f)
        binding!!.playlistRecyclerView.setLayoutManager(GridLayoutManager(this, span))

        binding!!.popularSongsRecyclerView.setLayoutManager(
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        )
        binding!!.popularArtistsRecyclerView.setLayoutManager(
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        )
        binding!!.popularAlbumsRecyclerView.setLayoutManager(
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        )

        OverScrollDecoratorHelper.setUpOverScroll(
            binding!!.popularSongsRecyclerView,
            OverScrollDecoratorHelper.ORIENTATION_HORIZONTAL
        )
        OverScrollDecoratorHelper.setUpOverScroll(
            binding!!.popularArtistsRecyclerView,
            OverScrollDecoratorHelper.ORIENTATION_HORIZONTAL
        )
        OverScrollDecoratorHelper.setUpOverScroll(
            binding!!.popularAlbumsRecyclerView,
            OverScrollDecoratorHelper.ORIENTATION_HORIZONTAL
        )

        binding!!.refreshLayout.setOnRefreshListener {
            showShimmerData()
            showData()
            binding!!.refreshLayout.isRefreshing = false
        }

        MiniPlayerHelper.initMiniPlayer(this)

        showShimmerData()
        showData()

        askNotificationPermission()
    }

    private fun updateVersionTextInDrawer() {
        try {
            val versionName = packageManager.getPackageInfo(packageName, 0).versionName
            val drawerLayout: View? = slidingRootNavBuilder!!.layout
            if (drawerLayout != null) {
                val versionTextView = drawerLayout.findViewById<View?>(R.id.versionTxt)
                if (versionTextView is TextView) {
                    versionTextView.text = "version $versionName"
                }
            }
        } catch (e: PackageManager.NameNotFoundException) {
            Log.e(TAG, "Error getting app version: " + e.message)
        }
    }

    private fun setupDrawerClicks() {
        val drawerLayout = slidingRootNavBuilder?.layout ?: return
        drawerLayout.findViewById<View>(R.id.built_by)?.setOnClickListener {
            startActivity(Intent(this, BuiltByActivity::class.java))
            slidingRootNavBuilder?.closeMenu()
        }
    }

    override fun onResume() {
        super.onResume()
        NetworkChangeReceiver.registerReceiver(this, networkChangeReceiver)
        MiniPlayerHelper.onActivityResume(this)
    }

    override fun onPause() {
        super.onPause()
        NetworkChangeReceiver.unregisterReceiver(this, networkChangeReceiver)
        MiniPlayerHelper.onActivityPause(this)
    }

    override fun onBackPressed() {
        if (slidingRootNavBuilder!!.isMenuOpened) slidingRootNavBuilder!!.closeMenu()
        else super.onBackPressed()
    }

    override fun onDestroy() {
        MusicPlayerManager.cancelNotification()
        super.onDestroy()
    }

    private fun showData() {
        songs.clear()
        artists.clear()
        albums.clear()
        playlists.clear()

        val songSeeds = listOf("2023","2024","2025","2026","Hits", "Latest", "Romantic", "Chill", "Lo-Fi", "Dance", "Hindi", "Sad", "Love", "Workout", " ")
        val artistSeeds = listOf("2023","2024","2025","2026", " ")
        val albumSeeds = listOf("2023","2024","2025","2026","Hits", "Latest", "New", "Sad", "Lo-Fi", "Romantic", "Rock", "Pop", "Classic", "Party", " ")
        val playlistSeeds = listOf("2023","2024","2025","2026","Hits", "Latest", "Trending", "Party", "Devotional", "Chill", "Love", "Sad", "Top", "Classic", " ")
        
        val songQuery = songSeeds.random()
        val artistQuery = artistSeeds.random()
        val albumQuery = albumSeeds.random()
        val playlistQuery = playlistSeeds.random()

        val apiManager = ApiManager(this)

        apiManager.searchSongs(songQuery, 0, 15, object : RequestNetwork.RequestListener {
            override fun onResponse(
                tag: String?,
                response: String?,
                responseHeaders: HashMap<String?, Any?>?
            ) {
                val songSearch = Gson().fromJson(response, SongSearch::class.java)
                if (songSearch.success) {
                    val resultsList = songSearch.data?.results ?: emptyList()
                    for (results in resultsList) {
                        if (results == null) continue
                        val imageList = results.image
                        val imageUrl =
                            if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url
                                ?: "" else ""
                        songs.add(
                            AlbumItem(
                                results.name(), results.language + " " + results.year,
                                imageUrl, results.id
                            )
                        )
                    }
                    val adapter = ActivityMainPopularSongs(songs)
                    binding!!.popularSongsRecyclerView.setAdapter(adapter)
                    adapter.notifyDataSetChanged()
                    BaseApplicationClass.sharedPreferenceManager?.homeSongsRecommended = songSearch
                } else {
                    try {
                        showOfflineData()
                    } catch (e: JSONException) {
                        Log.e(TAG, "onResponse: ", e)
                    }
                }
            }

            override fun onErrorResponse(tag: String?, message: String?) {
                showOfflineData()
            }
        })

        apiManager.searchArtists(artistQuery, 0, 15, object : RequestNetwork.RequestListener {
            override fun onResponse(
                tag: String?,
                response: String?,
                responseHeaders: HashMap<String?, Any?>?
            ) {
                val artistSearch =
                    Gson().fromJson(response, ArtistsSearch::class.java)
                if (artistSearch.success) {
                    val resultsList = artistSearch.data?.results ?: emptyList()
                    for (results in resultsList) {
                        artists.add(results)
                    }
                    val adapter = ActivityMainArtistsItemAdapter(artists)
                    binding!!.popularArtistsRecyclerView.setAdapter(adapter)
                    adapter.notifyDataSetChanged()
                    BaseApplicationClass.sharedPreferenceManager?.homeArtistsRecommended =
                        artistSearch
                } else {
                    try {
                        showOfflineData()
                    } catch (e: JSONException) {
                        Log.e(TAG, "onResponse: ", e)
                    }
                }
            }

            override fun onErrorResponse(tag: String?, message: String?) {
                showOfflineData()
            }
        })

        apiManager.searchAlbums(albumQuery, 0, 15, object : RequestNetwork.RequestListener {
            override fun onResponse(
                tag: String?,
                response: String?,
                responseHeaders: HashMap<String?, Any?>?
            ) {
                val albumsSearch = Gson().fromJson(response, AlbumsSearch::class.java)
                if (albumsSearch.success) {
                    val resultsList = albumsSearch.data?.results ?: emptyList()
                    for (results in resultsList) {
                        if (results == null) continue
                        val imageList = results.image
                        val imageUrl =
                            if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url
                                ?: "" else ""
                        albums.add(
                            AlbumItem(
                                results.name(), results.language + " " + results.year,
                                imageUrl, results.id
                            )
                        )
                    }
                    val adapter = ActivityMainAlbumItemAdapter(albums)
                    binding!!.popularAlbumsRecyclerView.setAdapter(adapter)
                    adapter.notifyDataSetChanged()
                    BaseApplicationClass.sharedPreferenceManager?.homeAlbumsRecommended =
                        albumsSearch
                } else {
                    try {
                        showOfflineData()
                    } catch (e: JSONException) {
                        Log.e(TAG, "onResponse: ", e)
                    }
                }
            }

            override fun onErrorResponse(tag: String?, message: String?) {
                showOfflineData()
            }
        })

        apiManager.searchPlaylists(
            playlistQuery, null, null,
            object : RequestNetwork.RequestListener {
                override fun onResponse(
                    tag: String?,
                    response: String?,
                    responseHeaders: HashMap<String?, Any?>?
                ) {
                    val playlistsSearch =
                        Gson().fromJson(response, PlaylistsSearch::class.java)
                    if (playlistsSearch.success) {
                        val resultsList = playlistsSearch.data?.results ?: emptyList()
                        for (results in resultsList) {
                            if (results == null) continue
                            val imageList = results.image
                            val imageUrl =
                                if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url
                                    ?: "" else ""
                            playlists.add(
                                AlbumItem(
                                    results.name(), "",
                                    imageUrl, results.id
                                )
                            )
                        }
                        val adapter = ActivityMainPlaylistAdapter(playlists)
                        binding!!.playlistRecyclerView.setAdapter(adapter)
                        adapter.notifyDataSetChanged()
                        BaseApplicationClass.sharedPreferenceManager?.homePlaylistRecommended =
                            playlistsSearch
                    } else {
                        try {
                            showOfflineData()
                        } catch (e: JSONException) {
                            Log.e(TAG, "onResponse: ", e)
                        }
                    }
                }

                override fun onErrorResponse(tag: String?, message: String?) {
                    showOfflineData()
                }
            })
    }

    private fun showShimmerData() {
        val dataShimmer: MutableList<AlbumItem?> = ArrayList()
        val artistsShimmer: MutableList<ArtistsSearch.Data.Results?> =
            ArrayList()
        for (i in 0..10) {
            dataShimmer.add(AlbumItem("<shimmer>", "<shimmer>", "<shimmer>", "<shimmer>"))
            artistsShimmer.add(
                ArtistsSearch.Data.Results(
                    "<shimmer>",
                    "<shimmer>",
                    "<shimmer>",
                    "<shimmer>",
                    "<shimmer>",
                    null
                )
            )
        }
        binding!!.popularSongsRecyclerView.setAdapter(ActivityMainAlbumItemAdapter(dataShimmer))
        binding!!.popularAlbumsRecyclerView.setAdapter(ActivityMainAlbumItemAdapter(dataShimmer))
        binding!!.popularArtistsRecyclerView.setAdapter(
            ActivityMainArtistsItemAdapter(
                artistsShimmer
            )
        )
        binding!!.playlistRecyclerView.setAdapter(ActivityMainPlaylistAdapter(dataShimmer))
    }

    private fun showOfflineData() {
        val prefManager = BaseApplicationClass.sharedPreferenceManager ?: return
        val songSearch: SongSearch? = prefManager.homeSongsRecommended
        if (songSearch != null) {
            val resultsList = songSearch.data?.results ?: emptyList()
            for (results in resultsList) {
                if (results == null) continue
                val imageList = results.image
                val imageUrl =
                    if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url ?: "" else ""
                songs.add(
                    AlbumItem(
                        results.name(), results.language + " " + results.year,
                        imageUrl, results.id
                    )
                )
            }
            val adapter = ActivityMainPopularSongs(songs)
            binding!!.popularSongsRecyclerView.setAdapter(adapter)
            adapter.notifyDataSetChanged()
        }

        val artistsSearch: ArtistsSearch? = prefManager.homeArtistsRecommended
        if (artistsSearch != null) {
            val resultsList = artistsSearch.data?.results ?: emptyList()
            for (results in resultsList) {
                artists.add(results)
            }
            val adapter = ActivityMainArtistsItemAdapter(artists)
            binding!!.popularArtistsRecyclerView.setAdapter(adapter)
            adapter.notifyDataSetChanged()
        }

        val albumsSearch: AlbumsSearch? = prefManager.homeAlbumsRecommended
        if (albumsSearch != null) {
            val resultsList = albumsSearch.data?.results ?: emptyList()
            for (results in resultsList) {
                if (results == null) continue
                val imageList = results.image
                val imageUrl =
                    if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url ?: "" else ""
                albums.add(
                    AlbumItem(
                        results.name(), results.language + " " + results.year,
                        imageUrl, results.id
                    )
                )
            }
            val adapter = ActivityMainAlbumItemAdapter(albums)
            binding!!.popularAlbumsRecyclerView.setAdapter(adapter)
            adapter.notifyDataSetChanged()
        }

        val playlistsSearch: PlaylistsSearch? = prefManager.homePlaylistRecommended
        if (playlistsSearch != null) {
            val resultsList = playlistsSearch.data?.results ?: emptyList()
            for (results in resultsList) {
                if (results == null) continue
                val imageList = results.image
                val imageUrl =
                    if (!imageList.isNullOrEmpty()) imageList[imageList.size - 1]?.url ?: "" else ""
                playlists.add(
                    AlbumItem(
                        results.name(), "", imageUrl,
                        results.id
                    )
                )
            }
            val adapter = ActivityMainPlaylistAdapter(playlists)
            binding!!.playlistRecyclerView.setAdapter(adapter)
            adapter.notifyDataSetChanged()
        }
    }

    fun openSearch(view: View?) {
        startActivity(Intent(this, SearchActivity::class.java))
    }

    private val requestPermissionLauncher = registerForActivityResult(RequestPermission()) { _: Boolean? -> }

    private fun askNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            }
        }
    }

    companion object {
        fun calculateNoOfColumns(
            context: Context,
            columnWidthDp: Float
        ): Int {
            val displayMetrics = context.resources.displayMetrics
            val screenWidthDp = displayMetrics.widthPixels / displayMetrics.density
            return (screenWidthDp / columnWidthDp + 0.5).toInt()
        }
    }
}
