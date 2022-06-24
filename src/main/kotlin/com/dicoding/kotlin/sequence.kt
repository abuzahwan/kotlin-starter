package com.dicoding.kotlin

fun main() {
    val list = (1..1000000).toList()
    list.asSequence().filter { it % 25 == 0 }.map { it * 10 }.forEach { println(it) }
}