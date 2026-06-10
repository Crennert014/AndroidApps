package com.example.androidapps

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity

/**
 * SplashActivity — Welcome screen.
 *
 * Fades in the logo + title, then after a short delay automatically
 * transitions to MainActivity using a cross-fade animation.
 * Users can also tap anywhere to skip the wait.
 */
class SplashActivity : AppCompatActivity() {

    companion object {
        private const val SPLASH_DELAY_MS = 2500L
    }

    private var navigated = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val logo     = findViewById<View>(R.id.splashLogo)
        val title    = findViewById<View>(R.id.splashTitle)
        val subtitle = findViewById<View>(R.id.splashSubtitle)
        val root     = findViewById<View>(R.id.splashRoot)

        // Load a fresh animation instance per view to avoid shared-state issues
        logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in).also { it.startOffset = 0 })
        logo.alpha = 1f

        title.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in).also { it.startOffset = 200 })
        title.alpha = 1f

        subtitle.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in).also { it.startOffset = 400 })
        subtitle.alpha = 1f

        // Auto-advance after SPLASH_DELAY_MS
        root.postDelayed({ goToMain() }, SPLASH_DELAY_MS)

        // Tap anywhere to skip
        root.setOnClickListener { goToMain() }
    }

    private fun goToMain() {
        // Guard against double-navigation (e.g. tap fires after the delayed callback)
        if (navigated) return
        navigated = true
        startActivity(Intent(this, MainActivity::class.java))
        // Cross-fade transition
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        finish()
    }
}
