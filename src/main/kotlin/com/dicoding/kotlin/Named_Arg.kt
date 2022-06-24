package com.dicoding.kotlin

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}


fun main() {
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    println(fullName)

    //ubah posisi lampiran argumen
    val fullName1 = getFullName(middle = " is " , first = "Kotlin", last = "Awesome")
    println(fullName1)

}