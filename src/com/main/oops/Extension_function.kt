package com.main.oops

// An extension function is a function that is defined outside a class,
// but can be called as if it were part of that class. We can use this
// feature on both user-defined classes and library classes

// Extension function on String to split it into a list of words
fun String.getAllWords(): List<String> {
    return this.split(" ")
}

fun main() {
    val a: String = "How are you"
    val words = a.getAllWords()
    println(words)
}