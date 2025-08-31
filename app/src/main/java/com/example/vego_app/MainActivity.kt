package com.example.vego_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // CHANGE THIS LINE to use your payment layout instead of activity_main
        setContentView(R.layout.activity_main) // Replace with your actual layout name

        // Make sure this ID matches your root view in the payment layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Automatically navigate to next page after delay
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, onboard_1::class.java)
            startActivity(intent)
            finish() // Optional: close this activity
        }, 5000) // 5 seconds delay
    }
}