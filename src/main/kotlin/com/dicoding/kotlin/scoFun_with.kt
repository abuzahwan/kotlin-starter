package com.dicoding.kotlin

fun main() {
    val message = "Hello Kotlin!"
    val result1 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }

    val result2 = with(message) {
        "First character is ${this[0]}" +
                " and the last character is ${this[this.length - 1]}"
    }

    println(result2)
}