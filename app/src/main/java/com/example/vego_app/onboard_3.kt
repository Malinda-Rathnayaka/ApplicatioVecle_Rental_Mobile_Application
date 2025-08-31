package com.example.vego_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.vego_app.R.id.btnSKOnscreen3


class onboard_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use your actual layout file name here:
        setContentView(R.layout.activity_onboard3)

        val skip = findViewById<Button>(btnSKOnscreen3)
        val dot1 = findViewById<Button>(R.id.btn1onScreen3)
        val dot2 = findViewById<Button>(R.id.btn2onScreen3)  // change to your actual id
        val dot3 = findViewById<Button>(R.id.btn2onScreen3)  // change to your actual id


        skip.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
        }
        dot1.setOnClickListener {
            startActivity(Intent(this, onboard_1::class.java))
        }
        dot2.setOnClickListener {
            startActivity(Intent(this, onboard_2::class.java))
        }
        dot3.setOnClickListener {
            Toast.makeText(this, "You’re already on screen 2", Toast.LENGTH_SHORT).show()
        }

    }
}
