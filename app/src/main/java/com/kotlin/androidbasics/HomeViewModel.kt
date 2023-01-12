package com.kotlin.androidbasics

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var array = arrayListOf<String>()
        private set

    fun add(text: String) = array.add(text)

    fun show(): String = array.joinToString(" ")
}