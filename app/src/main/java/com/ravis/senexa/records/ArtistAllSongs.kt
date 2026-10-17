package com.ravis.senexa.records

import com.ravis.senexa.records.SongResponse.Song


data class ArtistAllSongs(
    val success: Boolean,
    val data: Data?
) {
    
    data class Data(
        val total: Int,
        val songs: MutableList<Song?>?
    )
}
