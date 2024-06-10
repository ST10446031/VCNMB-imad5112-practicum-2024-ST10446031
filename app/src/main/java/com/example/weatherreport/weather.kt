package com.example.weatherreport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class weather : AppCompatActivity() {
        val days = arrayOf<Int>(39,29,31,30,26,22,25)
        var counter = 0
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_weather)

            var enterResults =findViewById<Button>(R.id.enterResults) // declaring the Button
            var textViewWeeks =findViewById<TextView>(R.id.textViewWeeks) // declaring the Text view
            var editText = findViewById<EditText>(R.id.editText) // Declaring the edit text
            var exit =findViewById<Button>(R.id.exit)
            var back = findViewById<Button>(R.id.back)
            var average = findViewById<Button>(R.id.average)



            enterResults.setOnClickListener {
               var enterWeather = editText.text.toString().toInt()

                if (counter < 7 ) {         // THE IIE,2024
                    days[counter] = enterWeather
                    counter++

                    var display = ""
                    var count = 0
                    while (count < 7){
                        display += "${days[count]}\n"
                        count++
                    }

                    textViewWeeks.text = display
                    editText.text.clear()
                }else {
                    Toast.makeText(this@weather,"Cannot save more weather results", Toast.LENGTH_LONG ).show()
                }
            }
            average.setOnClickListener {
                var sum : Double = 0.0
                var counter = 0
                while (counter < 7){                // THE IIE,2024
                    sum += days[counter]
                    counter++
                }
                var totalAverage : Double = 0.0     // this code is for the button that will do the calculation for the average
                totalAverage = sum / 7      //this is the calculation fpr the average
                textViewWeeks.text = "$totalAverage"
            }  // the total

            back.setOnClickListener {
                val intent = Intent(this,allWeek::class.java)
                startActivity(intent)
            }
            exit.setOnClickListener {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }



}

/*
The IIE 2024.Introduction to Mobile Application and Web Development [IMAD5112 Module Manual]. The Indipendent Institute of Education:Unplished. [Accessed 10 May 2024]
Unlishing the Power of Faith[online]Available at:https://www.savannahumc.org/unleashing-the-power-of-faith/.[Accessed 10 May 2024]

 */
