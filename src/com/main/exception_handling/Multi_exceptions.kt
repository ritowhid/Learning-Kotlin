package com.main.exception_handling

fun main() {
    try {
        val arr = arrayOf(1, 2, 3)
        val result = 10 / 0          // This will throw ArithmeticException
        println(arr[5])              // This would throw ArrayIndexOutOfBoundsException (but never reached)
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception: ${e.message}")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Array Index Exception: ${e.message}")
    } catch (e: Exception) {
        println("General Exception: ${e.message}")
    }

    println("Program continues...")
}