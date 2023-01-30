package com.alsbihawi.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtEventName = findViewById<TextView>(R.id.txtEventName)
        txtEventName.isSelected = true
        Toast.makeText(this, "on Create", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "on start", Toast.LENGTH_SHORT).show()
    }
}