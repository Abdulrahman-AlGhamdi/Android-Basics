package com.kotlin.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val backButton = findViewById<Button>(R.id.back)

        backButton.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}