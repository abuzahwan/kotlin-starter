package com.dicoding.kotlin

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values
    //tampilkan nilai keys
    println(mapKeys)
    //tampilkan nilai values
    println(mapValues)

    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital["Amsterdam"])

}