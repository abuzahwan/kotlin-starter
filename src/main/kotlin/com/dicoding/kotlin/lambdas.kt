package com.dicoding.kotlin

val message = { println("Hello from Lambda")}
//menambahkan parameter pada Lambda
val printMessege = {message: String -> println(message)}
//pengembalian nilai pada lambda ber-parameter
val messLength = { message1: String -> message1.length}

fun main() {

    //dapat dipanggil seperti fungsi pada umumnya
    message()

    //pemanggilan parameter
    printMessege("Hello from Lambda in Parameter")

    //pemanggilan lamba ber-parameter dengan pengembalian nilai
    val length: Int = messLength("Hello from Lambda in Parameter")
    println("Jumlah karakter pada kalimat di atas: $length")
}

