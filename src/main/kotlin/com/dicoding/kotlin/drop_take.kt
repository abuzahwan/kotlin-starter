package com.dicoding.kotlin

val number = listOf(1, 2, 3, 4, 5, 6,7,8)
val drop1 = number.drop(3)
val drop2 = number.dropLast(3)
val take1 = number.take(4)
val take2 = number.takeLast(4)

fun main() {
    println(drop1)
    println(drop2)
    println(take1)
    println(take2)
}