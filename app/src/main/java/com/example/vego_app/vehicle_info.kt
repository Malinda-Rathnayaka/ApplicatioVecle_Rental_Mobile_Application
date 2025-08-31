package com.example.vego_app



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class vehicle_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle_info)


       // val skip = findViewById<Button>(R.id.btnOnscreen1Skip)
        val btnBack = findViewById<Button>(R.id.btnBack)


        btnBack.setOnClickListener {
            startActivity(Intent(this, Ghoome::class.java))

        }
    }
}