package com.dicoding.kotlin

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    println("Factorial 999 is: ${factorial(999)}")
}