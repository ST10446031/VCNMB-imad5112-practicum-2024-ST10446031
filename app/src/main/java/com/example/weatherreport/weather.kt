package com.example.weatherreport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Arrays

fun logArrayValues(array:Array<String>, limit: Int = 0) {
   /* if (limit == 0) {
        Log.v("Array Values", Arrays.toString(array))
    } else {
        Log.v("Array values", Arrays.toString(array.sliceArray(0..limit - 1)))
    }
}*/
class weather : AppCompatActivity() {
    val days = arrayOf<String>("MONDAY",
        "TUESDAY",
        "WEDNESDAY",
        "THURSDAY",
        "FRIDAY",
        "SATURDAY",
        "SUNDAY")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        var button = findViewById<Button>(R.id.button) // declaring the Button
        var textViewWeeks = findViewById<TextView>(R.id.textViewWeeks) // declaring the Text view
        var editText = findViewById<EditText>(R.id.editText) // Declaring the edit text



        textViewWeeks.text= days[0] // displays the days of the week in the array
        days[0] = "Monday" // insert a value inside an array


        var counter= 0
        var daysDisplay = ""
        daysDisplay += "${days[0]}\n"
        daysDisplay += "${days[1]}\n"
        daysDisplay += "${days[2]}\n"
        daysDisplay += "${days[3]}\n"
        daysDisplay += "${days[4]}\n"
        daysDisplay += "${days[5]}\n"
        daysDisplay += "${days[6]}\n"

        textViewWeeks.text = daysDisplay

        button.setOnClickListener {
           /* var input = editText.text.toString()
            days[counter]= input
            counter++*/
            textViewWeeks.clearComposingText()
            var weeks=7
            var forcast= 33

            if (days == days)
                else  "The forecast of the week is"
            textViewWeeks.text

            





        }
    }



}
