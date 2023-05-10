package com.example.midtermexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)

        val name = intent.extras?.getString("NAME","")

        nameTextView.text = "Hello, $name"

    }
}