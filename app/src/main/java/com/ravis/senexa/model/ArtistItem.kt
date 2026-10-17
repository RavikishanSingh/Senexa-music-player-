package com.ravis.senexa.model

import com.ravis.senexa.utils.TextParserUtil


data class ArtistItem(
    val name: String?,
    val image: String?,
    val id: String?
) {
    fun name(): String {
        return TextParserUtil.parseHtmlText(name)
    }
}
