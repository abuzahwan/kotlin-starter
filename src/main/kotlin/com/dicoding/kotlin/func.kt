package com.dicoding.kotlin

private fun setGuess(name: String, age: Int): String {
    return "I guess, your name is $name, and your age is $age years old"
}

public fun setUser(name: String) {
    println("My name is $name")
}

fun main() {
    val Guess = setGuess("Khadafi", 25).also {
        println(it)
    }
    setUser("Bayu Andika")
}