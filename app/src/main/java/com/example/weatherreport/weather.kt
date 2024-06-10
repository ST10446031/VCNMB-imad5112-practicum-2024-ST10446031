package com.example.weatherreport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class weather : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        var button = findViewById<Button>(R.id.button)
        var textViewWeeks = findViewById<TextView>(R.id.textViewWeeks)
        var editText = findViewById<EditText>(R.id.editText)


    }
}