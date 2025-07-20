package com.main.exception_handling

fun main() {
    val numbers = arrayOf(1, 2, 3, 4)
    val a = 10
    val b = 0

    try {
        try {
            println(numbers[2])    // Valid index
            println(numbers[4])    // Invalid index (will throw ArrayIndexOutOfBoundsException)
        } catch (e: ArrayIndexOutOfBoundsException) {
            println(e)
        }

        try {
            val result = a / b     // Will throw ArithmeticException
            println(result)
        } catch (e: NullPointerException) {
            println("Null pointer error occurred.")
        }

    } catch (e: ArithmeticException) {
        println(e)
    }
}