package com.dicoding.kotlin
import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal00 {
    var name: String by DelegateName()

    var nameGC: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

fun main() {
    val animal1 = Animal00()
    animal1.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal1.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")

    val animal2 = Animal00()
    animal2.nameGC = "Dicoding cat"
    animal2.weight = 6.2
    animal2.age = 1

    println()
    println("Nama: ${animal2.nameGC}")
    println("Berat: ${animal2.weight}")
    println("Umur: ${animal2.age} Tahun")
}