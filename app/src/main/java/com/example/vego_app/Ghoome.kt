package com.example.vego_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Ghoome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ghoome)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_search -> {
                    // Navigate to search activity
                    val intent = Intent(this, search::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_cart -> {
                     // Navigate to search activity
                    val intent = Intent(this, booking::class.java)
                    startActivity(intent)
                     true
                }
                R.id.navigation_profile -> {
                    // Navigate to search activity
                    val intent = Intent(this, profile::class.java)
                    startActivity(intent)
                    true
                }


                else -> {
                    // For other tabs, do nothing for now
                    true
                }
            }
        }
    }
}