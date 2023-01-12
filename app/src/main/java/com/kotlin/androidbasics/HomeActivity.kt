package com.kotlin.androidbasics

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProvider

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val viewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        val username = findViewById<TextView>(R.id.username)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val add = findViewById<Button>(R.id.add)
        val input = findViewById<EditText>(R.id.input)

        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.files -> {
                    Toast.makeText(applicationContext, "Files", Toast.LENGTH_SHORT).show()
                }
                R.id.settings -> {
                    Toast.makeText(applicationContext, "Settings", Toast.LENGTH_SHORT).show()
                }
            }
            false
        }

        username.text = viewModel.show()

        toolbar.setNavigationOnClickListener {
            finish()
        }

        add.setOnClickListener {
            val text = input.text.toString()

            if (text.isNotBlank()) {
                viewModel.add(input.text.toString())
                username.text = viewModel.show()
                input.setText("")
            }
        }

        val nameFromFirstActivity = intent.getStringExtra("number")
        username.text = nameFromFirstActivity ?: "Value is null"
    }

    override fun onBackPressed() {
        Toast.makeText(applicationContext, "Please wait", Toast.LENGTH_SHORT).show()
    }
}