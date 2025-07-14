package com.main.basic_Kt

fun main() {
    val lap = arrayOf("Macbook", "Dell", "Lenovo", "Asus", "Hp")
    lap.forEach { lap ->
        println(lap)
    }

    // index
    lap.forEachIndexed { index, lap -> println("$index -> is the index of $lap") }
}