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

        startButton.setOnClickListener { // THE IIE,2024
                val intent = Intent(this,allWeek::class.java)
                startActivity(intent)
        }
    }
}
/*
}The IIE 2024.Introduction to Mobile Application and Web Development [IMAD5112 Module Manual]. The Indipendent Institute of Education:Unplished. [Accessed 10 May 2024]
Wallpaper Access. Sky and Wallpaper.2024[online]Available at:https://wallpaperaccess.com/sky-and-clouds. [Accessed 10 May 2024]
 */