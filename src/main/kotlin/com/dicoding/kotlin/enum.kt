package com.dicoding.kotlin

fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println(color)
    }

    val color: Color = Color.valueOf("RED")
    println("Color is $color")

    val colorOr: Color = Color.RED
    println("Position $color is ${colorOr.ordinal}")

    val colorWn: Color = Color.GREEN
    when(colorWn){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}