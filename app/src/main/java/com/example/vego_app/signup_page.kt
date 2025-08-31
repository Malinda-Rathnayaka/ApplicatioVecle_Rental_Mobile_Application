package com.example.vego_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_page)

        val btnLogIn = findViewById<Button>(R.id.btnLoginSignUp)
        val btnGoogle = findViewById<Button>(R.id.btnGoogle)

        btnLogIn.setOnClickListener {
            startActivity(Intent(this, Ghoome::class.java))
        }

        btnGoogle.setOnClickListener {
            openGoogleWebsite()
        }

    }
    private fun openGoogleWebsite() {
        val uri = Uri.parse("https://www.google.com")
        val intent = Intent(Intent.ACTION_VIEW, uri).apply {
            addCategory(Intent.CATEGORY_BROWSABLE)
        }
        startActivity(intent)
    }
}