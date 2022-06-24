package com.dicoding.kotlin

fun main() {
    val text = "Hello"
    println("value from text is $text")
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "then replace text from $from to $to"
            }
    println(result)

}