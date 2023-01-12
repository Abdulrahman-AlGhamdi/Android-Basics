package com.kotlin.androidbasics

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_e1)
        Log.d("TAG", "onCreate: ")

        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val plusButton = findViewById<Button>(R.id.plus)
        val minusButton = findViewById<Button>(R.id.minus)
        val number = findViewById<TextView>(R.id.number)
        val next = findViewById<TextView>(R.id.next)

        number.text = viewModel.counter.toString()

        plusButton.setOnClickListener {
            number.text = viewModel.add()
        }

        minusButton.setOnClickListener {
            number.text = viewModel.minus()
        }

        next.setOnClickListener {
            val intent = Intent(applicationContext, HomeActivity::class.java)
            intent.putExtra("number", number.text)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy: ")
    }
}