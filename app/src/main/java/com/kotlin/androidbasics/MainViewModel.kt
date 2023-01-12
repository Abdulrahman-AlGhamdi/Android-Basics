package com.kotlin.androidbasics

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var counter = 0
        private set

    fun add(): String {
        counter++

        return if (counter >= 0) counter.toString()
        else "Number below zero: $counter"
    }

    fun minus(): String {
        counter--

        return if (counter >= 0) counter.toString()
        else "Number below zero: $counter"
    }
}