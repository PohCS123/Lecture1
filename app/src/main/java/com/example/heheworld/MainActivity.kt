package com.example.heheworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO continue your work here
        //val = value, var =variable

        val buttonPressMe : Button = findViewById(R.id.buttonPressMe)
        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonPressMe.setOnClickListener { showMessage() }
        buttonReset.setOnClickListener { showReset() }

    }

    private fun showReset() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText("Hello")
    }

    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText("Hello konoyaro")
    }

}
