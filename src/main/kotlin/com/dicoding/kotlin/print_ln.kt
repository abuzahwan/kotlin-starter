package com.dicoding.kotlin

fun main() {
    val name = "Bayu Andika"
    val child = buildString {
        append("Jasmine Adzkia R. S & Jahwan Athallah H.S")
    }

    print("Hello my name is ")
    println(name)
    println("and the names of my daughter & my son is $child")
    print(if (true) "Always true" else "Always false")
}