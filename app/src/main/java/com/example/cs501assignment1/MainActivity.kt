package com.example.cs501assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        val textViewButton = findViewById<TextView>(R.id.textViewButton)

        val toolbar =  findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        toggleButton.setOnCheckedChangeListener {_, isClicked ->
            if (isClicked) {
                textViewButton.visibility = View.VISIBLE
            } else {
                textViewButton.visibility = View.INVISIBLE
            }
        }
    }
}

// resources used for this assignment in XML:
// https://stackoverflow.com/questions/49402001/how-to-set-visibility-in-kotlin
// https://www.geeksforgeeks.org/togglebutton-in-kotlin
// ^^ this taught me toggleButton.setOnCheckedChangeListener... in main
// ^^ this taught me  android:id="@+/..." to refer to variables from main
// https://www.geeksforgeeks.org/toolbar-in-android-with-example/
// ^^ this taught me how to create a toolbar with text
// ^^ also taught me how to change the color of toolbar text
// https://stackoverflow.com/questions/4127725/how-can-i-remove-a-button-or-make-it-invisible-in-android




