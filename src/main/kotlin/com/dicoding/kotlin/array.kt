package com.dicoding.kotlin

fun main() {
    val intArray = intArrayOf(1, 3, 5, 7)
    println("Deret array ke-2 : ${intArray[2]}")

    intArray[2] = 11
    print("Setelah diganti menjadi --> ${intArray[2]}")
}