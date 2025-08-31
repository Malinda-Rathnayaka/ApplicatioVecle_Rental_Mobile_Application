package com.example.vego_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class book_paymet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_book_paymet)

        val btnBack = findViewById<Button>(R.id.backButton)
        val process = findViewById<Button>(R.id.btnProcess)

        btnBack.setOnClickListener {
            startActivity(Intent(this, Ghoome::class.java))
        }
        process.setOnClickListener {
            Toast.makeText(this, "Your payment successfully", Toast.LENGTH_SHORT).show()
        }

     }
}