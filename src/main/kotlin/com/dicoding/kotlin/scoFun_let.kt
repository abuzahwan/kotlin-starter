package com.dicoding.kotlin

fun main() {
    val message: String? = null
    message?.let {
        val length = it.length
        val text = "text length $length"
        println(text)
    }
}