package com.dicoding.kotlin

val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val index = listOf(2, 3, 5, 8)

val slice1 = total.slice(3..6)
val slice2 = total.slice(3..6 step 2)
val slice3 = total.slice(index)

fun main () {
println(slice1)
println(slice2)
println(slice3)
}