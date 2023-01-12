package com.kotlin.androidbasics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val backButton = findViewById<Button>(R.id.back)
        val username = findViewById<TextView>(R.id.username)

        val nameFromFirstActivity = intent.getStringExtra("number")
        username.text = nameFromFirstActivity ?: "Value is null"

        backButton.setOnClickListener {
            finish()
        }
    }
}