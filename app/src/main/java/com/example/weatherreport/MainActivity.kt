package com.example.weatherreport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var heading = findViewById<TextView>(R.id.heading)
        var slogan = findViewById<TextView>(R.id.slogan)
        var startButton = findViewById<Button>(R.id.startButton)

        startButton.setOnClickListener {
                val intent = Intent(this,allWeek::class.java)
                startActivity(intent)
        }
    }
}