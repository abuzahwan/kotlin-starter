package com.dicoding.kotlin

fun main() {
    val text = "Hello Kotlin, \nH E L L O   W O R L D ! ! !"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}