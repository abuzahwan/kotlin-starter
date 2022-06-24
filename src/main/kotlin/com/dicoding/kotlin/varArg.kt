package com.dicoding.kotlin

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun getNumbersSize(vararg number: Int): Int {
    return number.size
}

fun sets(vararg number: Int) {
    println(number.sum())
}

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)
    val number1 = getNumbersSize(15,25,35,45,55)
    println(number1)

    val number2 = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *number2 , 10)
}