package com.main.exception_handling
// expression: Return a value
// statement: does something but doesn't return a value
fun test(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println(e)
        println("Divide by zero not allowed")
        0
    }
}

fun main() {
    println(test(10, 2))
    println(test(10, 0))
}