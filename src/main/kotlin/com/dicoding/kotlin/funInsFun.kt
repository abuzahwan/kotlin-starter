package com.dicoding.kotlin

fun setWord0(message: String) {
    fun printMessage(text: String) {
        println(text)
    }

    printMessage(message)
}

//akses dari dalam fungsi print
fun setWord1(message: String) {
    fun printMessage() {
        println(message)
    }

    printMessage()
}

fun main() {
    println(setWord0("hello kotlin"))

    println(setWord1("Selamat Idul Adha"))
}