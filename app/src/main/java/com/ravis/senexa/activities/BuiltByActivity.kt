package com.ravis.senexa.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ravis.senexa.R

class BuiltByActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_built_by)
    }

    fun backPress(view: View?) {
        finish()
    }
}
