package com.example.cs501assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggleButton = findViewById<Button>(R.id.toggleButton)
        val textViewButton = findViewById<TextView>(R.id.textViewButton)
        val toolbar =  findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        toggleButton.setOnClickListener{
            textViewButton.text = "Hello World"
        }
    }
}

// Resources used for this assignment in XML:
// https://www.geeksforgeeks.org/button-in-kotlin/
// ^^ this taught me toggleButton.setOnClickListener... in main
// ^^ this taught me  android:id="@+/..." to refer to variables from main
// https://www.geeksforgeeks.org/toolbar-in-android-with-example/
// ^^ this taught me how to create a toolbar with text
// ^^ also taught me how to change the color of toolbar text




