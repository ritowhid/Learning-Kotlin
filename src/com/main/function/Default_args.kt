package com.main.function

fun main() {

    // Call with argument
    greet("John") // Output: Hello, John!

    // Call without argument
    greet() // Output: Hello, World!

    // three cases of default arguments
    defaultArguments() // Uses default values
    defaultArguments("Rakib") // Overrides name only
    defaultArguments("Towhid", 2025) // Overrides both

    // Call with named arguments
    printName(lastName = "Doe", firstName = "John") // Output: First name: John, Last name: Doe
}

fun greet(name: String = "World") {
    println("Hello, $name!")
}

fun defaultArguments(myName: String = " ", myID: Int = 0) {
    println("Name: $myName, ID: $myID")
}

fun printName(firstName: String, lastName: String) {

    println("First name: $firstName, Last name: $lastName")
}
