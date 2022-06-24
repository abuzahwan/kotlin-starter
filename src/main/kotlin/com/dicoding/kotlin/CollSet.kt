package com.dicoding.kotlin

fun main() {
val integerSet = setOf(1, 2, 4, 2, 1, 5)
val setA = setOf(1, 2, 4, 2, 1, 5)
val setB = setOf(1, 2, 4, 5)
val setC = setOf(1, 5, 7)
val union = setA.union(setC)
val intersect = setA.intersect(setC)

    println(integerSet)
    println(setA == setB)
    println(6 in setA)
    println(union)
    println(intersect)
}