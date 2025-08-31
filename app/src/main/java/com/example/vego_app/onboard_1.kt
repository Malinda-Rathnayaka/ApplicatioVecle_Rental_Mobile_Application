package com.example.vego_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class onboard_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use your actual layout file name here:
        setContentView(R.layout.activity_onboard1)

        val skip = findViewById<Button>(R.id.btnOnscreen1Skip)
        val dot1 = findViewById<Button>(R.id.btn1onScreen1)
        val dot2 = findViewById<Button>(R.id.btn2onScreen1)
        val dot3 = findViewById<Button>(R.id.btn3onScreen1)

        skip.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
        }
        dot1.setOnClickListener {
            Toast.makeText(this, "You’re already on screen 1", Toast.LENGTH_SHORT).show()
        }
        dot2.setOnClickListener {
            startActivity(Intent(this, onboard_2::class.java))
        }
        dot3.setOnClickListener {
            startActivity(Intent(this, onboard_3::class.java))
        }
    }
}

