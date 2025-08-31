package com.example.vego_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val btnLogIn = findViewById<Button>(R.id.btnLogIn)
        val btnGoogle = findViewById<Button>(R.id.btnGoogle)
        val btnSignUp = findViewById<Button>(R.id.buttonSignUp)
        val rememberMeCheckbox = findViewById<CheckBox>(R.id.rememberMeCheckbox)

        btnGoogle.setOnClickListener {
            openGoogleWebsite()
        }

        btnLogIn.setOnClickListener {
            startActivity(Intent(this, Ghoome::class.java))
        }

        btnSignUp.setOnClickListener {
            startActivity(Intent(this, signup_page::class.java))
        }
    }

    // Member function (not inside onCreate)
    private fun openGoogleWebsite() {
        val uri = Uri.parse("https://www.google.com")
        val intent = Intent(Intent.ACTION_VIEW, uri).apply {
            addCategory(Intent.CATEGORY_BROWSABLE)
        }
        startActivity(intent)
    }
}