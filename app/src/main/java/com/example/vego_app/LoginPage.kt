package com.example.vego_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        // Find the login button
        val btnLogIn = findViewById<Button>(R.id.btnLogIn)

        // Set click listener for login button (simplified Kotlin syntax)
        btnLogIn.setOnClickListener {
            val intent = Intent(this, Ghoome::class.java)
            startActivity(intent)
        }

        // Find the sign up button
//        val buttonSignUp = findViewById<Button>(R.id.buttonSignUp)
//        buttonSignUp.setOnClickListener {
//            val intent = Intent(this, SignUpActivity::class.java)
//            startActivity(intent)
//        }

        // Find the Google login button
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            // Handle Google login
        }

        // Find the remember me checkbox
        val rememberMeCheckbox = findViewById<CheckBox>(R.id.rememberMeCheckbox)
    }
}