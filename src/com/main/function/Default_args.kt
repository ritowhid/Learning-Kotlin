package com.main.function

fun main() {
    defaultArguments() // Uses default values
    defaultArguments("Rakib") // Overrides name only
    defaultArguments("Towhid", 2025) // Overrides both
}

fun defaultArguments(myName: String = " ", myID: Int = 0) {
    println("Name: $myName, ID: $myID")
}