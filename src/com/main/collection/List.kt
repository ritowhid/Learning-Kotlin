package com.main.collection

fun main() {
    val fruits = listOf<String>("apple", "banana", "orange", "grape")
    // Access elements in the list
    println("First fruit: ${fruits[0]}")
    println("Last fruit: ${fruits.last()}")

    // iterate over the list
    for (fruits in fruits) {
        println(fruits)
    }

    // Filter the list
    val filtered = fruits.filter { it.startsWith("a") }
    println("Filtered list: $filtered")


}

/*
    Types of collections:
    1. immutable
    2. mutable
 */