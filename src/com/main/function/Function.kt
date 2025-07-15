package com.main.function

import kotlin.math.max
import kotlin.math.sqrt

/*
    Function: -> Standard library functions/Built-in library function
              -> User defined function
 */
fun main() {
    val a = max(1, 3)
    println(a)

    val b: Double = sqrt(33.0) // on a big project, you have to mention data type.
    println(b)

    /*  The function sqrt() in Kotlin comes from the Kotlin Math library and is defined as:
        -> fun sqrt(x: Double): Double
        This means:
        - It accepts a Double as input.
        - And returns a Double.
     */

    // Use rem() to find the remainder
    val num1 = 26
    val num2 = 3
    val resultRem = num1.rem(num2)
    println("The remainder when $num1 is divided by $num2 is: $resultRem")

    // add method
    val res = add()
    println(res)

    // add2 method
    val res2 = add2(32, 44)
    println(res2)
}

// user define function
fun add(): Int { // if no return type, use unit-> fun add(): Unit {
    val x = 5
    val y = 4
    val result = x + y
    return result
}

// using parameter
fun add2(i: Int, j: Int): Int {
    val c = i + j
    return c
}
