package com.example.vego_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use your actual layout file name here:
        setContentView(R.layout.activity_profile)


        val btnBack = findViewById<Button>(R.id.btnBack)
        val logout = findViewById<Button>(R.id.btnLogout)

        btnBack.setOnClickListener {
            startActivity(Intent(this, Ghoome::class.java))
        }

        logout.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
        }


    }
}
