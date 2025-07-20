package com.main.exception_handling

fun main() {
    val input = readLine() ?: "0"

    try {
        val num = input.toInt()
        val result = 100 / num
        println("Result: $result")
    } catch (e: Exception) {
        when (e) {
            is NumberFormatException -> println("Number Format Exception")
            is ArithmeticException -> println("Arithmetic Exception: Divide by zero")
            else -> println("Some other exception occurred: ${e.message}")
        }
    }
}