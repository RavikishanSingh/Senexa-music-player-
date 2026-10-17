package com.ravis.senexa.records

import com.ravis.senexa.records.SongResponse.Song
import com.ravis.senexa.utils.TextParserUtil


data class AlbumSearch(
    val success: Boolean,
    val data: Data?

) {
    
    data class Data(
        val id: String?,
        val name: String?,
        val url: String?,
        val description: String?,
        val year: Int,
        val playCount: Int,
        val language: String?,
        val explicitContent: Boolean,
        val artist: SongResponse.Artists?,
        val image: MutableList<GlobalSearch.Image?>?,
        val songs: MutableList<Song?>?
    ) {
        fun name(): String {
            return TextParserUtil.parseHtmlText(name)
        }

        fun description(): String {
            return TextParserUtil.parseHtmlText(description)
        }
    }
}
