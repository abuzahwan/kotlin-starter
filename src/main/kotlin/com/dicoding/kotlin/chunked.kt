package com.dicoding.kotlin

val word = "QWERTY"
val chunked = word.chunked(3)
val chunkedTransform = word.chunked(3) {
    it.toString().toLowerCase()
}

fun main() {
println(chunked)
println(chunkedTransform)
}