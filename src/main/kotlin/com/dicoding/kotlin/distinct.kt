package com.dicoding.kotlin

val total1 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
val distinct1 = total1.distinct()
val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
val items = listOf(
    Item("1", "Kotlin"),
    Item("2", "is"),
    Item("3", "Awesome"),
    Item("3", "as"),
    Item("3", "Programming"),
    Item("3", "Language")
)
val distinctItems = items.distinctBy { it.key }
val distinct2 = text.distinctBy {
    it.length
}

data class Item(val key: String, val value: Any)

fun main() {
    println(distinct1)
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

println(distinct2)
}