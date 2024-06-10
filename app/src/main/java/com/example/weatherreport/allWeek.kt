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

        nextPage.setOnClickListener {       // THE IIE,2024
            val intent = Intent(this, weather::class.java)
            startActivity(intent)
        }
    }
}
/*
}The IIE 2024.Introduction to Mobile Application and Web Development [IMAD5112 Module Manual]. The Indipendent Institute of Education:Unplished. [Accessed 10 May 2024]
Unlishing the Power of Faith. savannahumc [online]Available at:https://www.savannahumc.org/unleashing-the-power-of-faith/ .[Accessed 10 May 2024]

     */
