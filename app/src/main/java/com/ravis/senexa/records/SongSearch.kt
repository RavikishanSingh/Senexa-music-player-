package com.ravis.senexa.records

import com.ravis.senexa.records.SongResponse.Song


data class SongSearch(
    val success: Boolean,
    val data: Data?

) {
    
    data class Data(
        val total: Int,
        val start: Int,
        val results: MutableList<Song?>?
    )
}
