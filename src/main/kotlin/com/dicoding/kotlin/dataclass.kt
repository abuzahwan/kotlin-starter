package com.dicoding.kotlin

class User(val name : String, val age : Int){
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}
data class DataUser(val name : String, val age : Int) {
    //function dalam data class
    fun intro() {
        println("My name is $name, I am age is $age years old")
    }
}

fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    //fitur copy data
    val dataUser2 = dataUser.copy()
    //change nilai kembalian dari data class
    val dataUser3 = dataUser2.copy(name="Bandot")

    println(user)
    println(dataUser)
    println(dataUser2)
    println(dataUser3)


    val dataUser4 = DataUser("Jasmine ARS", 7)
    val name = dataUser4.component1()
    val age = dataUser4.component2()
    println()
    println("My daughter name is $name, and her age's $age years old")

    val dataUser5 = DataUser("Boncel", 77)
    val (name1, age1) = dataUser5

    println("His name is $name1, and his age is $age1 years old")

    val dataUser6 = DataUser("Hubert", 35)
    dataUser6.intro()
}