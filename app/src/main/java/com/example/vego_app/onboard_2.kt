package com.example.vego_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class onboard_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use your actual layout file name here:
        setContentView(R.layout.activity_onboard2)

        val skip = findViewById<Button>(R.id.btnOnscreen1Skip)
        val dot1 = findViewById<Button>(R.id.btn1onScreen2)
        val dot2 = findViewById<Button>(R.id.btn2onScreen2)  // change to your actual id
        val dot3 = findViewById<Button>(R.id.btn3onScreen1)  // change to your actual id

        skip.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
        }
        dot1.setOnClickListener {
            startActivity(Intent(this, onboard_1::class.java))
        }
        dot2.setOnClickListener {
            Toast.makeText(this, "You’re already on screen 2", Toast.LENGTH_SHORT).show()
        }
        dot3.setOnClickListener {
            startActivity(Intent(this, onboard_3::class.java))
        }
    }
}
