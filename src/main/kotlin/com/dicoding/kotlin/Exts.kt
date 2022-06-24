package com.dicoding.kotlin

//extension properties with receiver type
val Int.slice: Int
    get() = this / 2

//nullable receiver
val Int?.bagi: Int
    get() = this?.div(2) ?: 0

fun main() {
    println(3456.plusThree())
    println(10.slice)

    //penggunaan nullable
    val nilai: Int? = 0
    println(nilai.bagi)
}

fun Int.plusThree(): Int {
    return this + 3
}