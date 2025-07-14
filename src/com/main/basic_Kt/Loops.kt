package com.main.basic_Kt

fun main() {
    // =============================== For Loop ===============================
    /*
        Syntax:
        for (i in start..end) {
            // code block
        }
//     */
//
//    // Q: Print numbers from 1 to 5
    for (count in 1..5) {
        println(count)
    }

    for (count in 1..100 step 11) { // step 11 means it will increment count by 11 each time instead of the default 1.
        println(count)
    }

    for (count in 10 downTo 0 step 2 ) { // downTo mean printing from 10 to 0
        println(count)
    }
//
//    // =============================== For Loop with Input ===============================
//    // Q: Print numbers from 1 to n
    print("Enter a number: ")
    val n = readLine()?.toIntOrNull() ?: return
    for (num in 1..n) {
        println("$num ")
    }
//// =============================== While Loop ===============================
//    /*
//        Syntax:
//        while (condition) {
//            // code block
//        }
//     */
    var count = 1
    while (count <= 5) {
        println(count)
        count++
    }
//
//    // =============================== Do-While Loop ===============================
//    /*
//        Syntax:
//        do {
//            // block of code
//        } while (condition)
//     */
    var i = 1
    var d = 10
    do {
        println(d)
        d++
        i++
    } while (i < 5)

    // =============================== For-each Loop ===============================
    /*
        for (item in collection) {
            // use item
        }
//     */
    val numbers = arrayOf(10, 20, 30, 40, 50)
    for (num in numbers) {
        println(num)
    }
}