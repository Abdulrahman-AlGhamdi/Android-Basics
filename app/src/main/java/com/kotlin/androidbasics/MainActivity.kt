package com.kotlin.androidbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("*********** Created")
    }

    override fun onStart() {
        super.onStart()
        println("*********** Started")
    }

    override fun onResume() {
        super.onResume()
        println("*********** Resumed")
    }

    override fun onPause() {
        super.onPause()
        println("*********** Paused")
    }

    override fun onStop() {
        super.onStop()
        finish()
        println("*********** Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("*********** Destroyed")
    }
}