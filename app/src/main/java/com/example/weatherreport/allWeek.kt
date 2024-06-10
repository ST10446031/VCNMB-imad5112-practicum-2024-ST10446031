package com.example.weatherreport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class allWeek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_week)

        var nextPage = findViewById<Button>(R.id.nextPage)

        nextPage.setOnClickListener {
            val intent = Intent(this,weather::class.java)
            startActivity(intent)
        }
    }
}