package com.example.androidapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton

/**
 * Feature1Activity — Placeholder screen for Button 1.
 *
 * Replace / expand the layout (res/layout/activity_feature1.xml)
 * and add your logic here.
 */
class Feature1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1)

        // Set up the toolbar with a back arrow
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // "Back to Menu" button at the bottom of the screen
        findViewById<MaterialButton>(R.id.btnBackToMenu).setOnClickListener {
            finish()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
