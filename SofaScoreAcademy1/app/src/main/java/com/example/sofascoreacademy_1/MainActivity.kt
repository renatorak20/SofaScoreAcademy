package com.example.sofascoreacademy_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val text: TextView = findViewById(R.id.text)

        button.setOnClickListener {
            if(text.visibility == View.VISIBLE){
                text.visibility = View.INVISIBLE
                button.text = getString(R.string.button_show_text)
            }else{
                text.visibility = View.VISIBLE
                button.text = getString(R.string.button_hide_text)
            }
        }
    }
}