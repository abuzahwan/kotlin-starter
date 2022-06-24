package com.dicoding.kotlin

class Animal01(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Animal01.getAnimalInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main() {
    val dicodingCat = Animal01("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)
}