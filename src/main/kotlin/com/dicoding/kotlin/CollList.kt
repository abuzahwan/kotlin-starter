package com.dicoding.kotlin

val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
val charList = listOf('a', 'b', 'c')
val anyList = mutableListOf<Any>('a', "Kotlin", 3, true)

fun main() {
    println("Isi indeks 1 : ${anyList[1]}")

    anyList.add(1,"Berubah")
    println("Sisip indeks 1 jadi ${anyList[1]}")
    println(anyList.random())
    println(numberList)
}