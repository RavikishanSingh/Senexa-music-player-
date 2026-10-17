package com.ravis.senexa.services

interface ActionPlaying {
    fun nextClicked()
    fun prevClicked()
    fun playClicked()
    fun onProgressChanged(progress: Int)
}
