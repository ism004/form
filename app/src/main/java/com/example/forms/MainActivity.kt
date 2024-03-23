package com.example.forms

import android.R
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
            val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
            val textView8 = findViewById<TextView>(R.id.textView8)
            radioButton2.setOnClickListener { textView8.visibility = View.VISIBLE }
            radioButton3.setOnClickListener { textView8.visibility = View.GONE }
        }
    }

}