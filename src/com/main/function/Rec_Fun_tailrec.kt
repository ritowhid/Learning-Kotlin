package com.main.function
/*
    Tail Recursion: 'tailrec' - keyword in Kotlin used to optimize recursive functions that are tail-recursive,
    where recursive call is the last thing executed (no more computation after it).

    -> allows Kotlin to transform the recursion into a loop internally during compilation, so:
        - No Stack Overflow error for deep recursion,
        - Better performance, like a while loop,
        - Recursive logic without a function call overhead.
 */
fun main() {

    val myRes = recSum(50000, 0)
    println(myRes)
}
tailrec fun recSum(i: Long, j: Long): Long {
    return if (i < 1) {
        j
    } else {
        recSum(i - 1, i+j)
    }
}