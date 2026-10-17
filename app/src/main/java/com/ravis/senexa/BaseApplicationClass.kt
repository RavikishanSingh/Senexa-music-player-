package com.ravis.senexa

import android.app.Activity
import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.ravis.senexa.utils.MusicPlayerManager
import com.ravis.senexa.utils.SharedPreferenceManager

open class BaseApplicationClass : Application() {
    private val TAG = "ApplicationClass"

    override fun onCreate() {
        super.onCreate()

        sharedPreferenceManager = SharedPreferenceManager.getInstance(this)
        MusicPlayerManager.init(this)

        sharedPreferenceManager!!.migrateFromOldPrefs(this) { sharedPreferenceManager!!.clearOldPrefsAsync(this, null) }
    }

    companion object {
        var sharedPreferenceManager: SharedPreferenceManager? = null
        var currentActivity: Activity? = null

        fun updateTheme() {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        }
    }
}
