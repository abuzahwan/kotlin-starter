package com.dicoding.kotlin

//referensi sebuah extensions function
fun Int.ganjil() = this % 2 == 1

fun main() {
    val numbers = 1.rangeTo(20)
    val evenNumbers = numbers.filter(::isEvenNumber)

    println(evenNumbers)

    val numbers1 = 1.rangeTo(20)
    val evenNumbers1 = numbers1.filter(Int::ganjil)

    println(evenNumbers1)
}

fun isEvenNumber(number: Int) = number % 2 == 0