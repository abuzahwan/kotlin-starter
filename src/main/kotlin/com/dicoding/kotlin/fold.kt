package com.dicoding.kotlin

val numbers = listOf(1,2,3)
val fold = numbers.fold(10) { current, item ->
    println("current $current")
    println("item $item")
    println()
    current + item
}

fun main() {
    println("Fold result: $fold")
    println()
    println("Fungsi Fold Right")
    println("Fold Rights result: $foldR")
}

//fungsi fold -> iterasi dari indeks terakhir dari sebuah argumen
val foldR = numbers.foldRight(10) { item, current ->
    println("current $current")
    println("item $item")
    println()
    item + current
}
