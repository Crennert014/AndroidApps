package com.example.androidapps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

/**
 * MainActivity — Main menu.
 *
 * Displays five buttons. Each button opens its corresponding Feature activity.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialButton>(R.id.btn1).setOnClickListener {
            startActivity(Intent(this, Feature1Activity::class.java))
        }
        findViewById<MaterialButton>(R.id.btn2).setOnClickListener {
            startActivity(Intent(this, Feature2Activity::class.java))
        }
        findViewById<MaterialButton>(R.id.btn3).setOnClickListener {
            startActivity(Intent(this, Feature3Activity::class.java))
        }
        findViewById<MaterialButton>(R.id.btn4).setOnClickListener {
            startActivity(Intent(this, Feature4Activity::class.java))
        }
        findViewById<MaterialButton>(R.id.btn5).setOnClickListener {
            startActivity(Intent(this, Feature5Activity::class.java))
        }
    }
}
