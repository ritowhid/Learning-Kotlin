package com.main.exception_handling

fun main() {
    try {
        val num = 10 / 0
        println(num)
    } catch (e: ArithmeticException) {
        println("Divide by zero is not allowed") // This will run if an exception happens
        println(e.message)
        println(e)
    }finally {
        println("finally block executed")
    }
}