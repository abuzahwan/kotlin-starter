package com.dicoding.kotlin

fun main() {
    val message = buildString {
        append("Jasmine ")
        append("Adzkia ")
        append("R. S. ")
    }

    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}