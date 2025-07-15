package com.main.basic_Kt

fun main() {
    val myArr: Array<Int> = arrayOf(3, 4, 5, 6, 7) //implicit type declaration
    println(myArr[2])

    val arrNum = arrayOf(4, 5, 6, 7, 8) //implicit type declaration
    println(arrNum[1])

    val random: Array<Any> = arrayOf(1, 2, "Hello", true, 'R', 4.5)
    println(random[4])

    val myIntArray: IntArray = intArrayOf(3, 2, 1)
    val myBoolArray: BooleanArray = booleanArrayOf(true, false, true)
    val myDoubleArray: DoubleArray = doubleArrayOf(4.452523569874155, 34.45678941645282, 45.23423333333354)
    val myCharArray: CharArray = charArrayOf('a', 'b', 'c', 'd', 'e')

//     Primitive: byte, short, int, long, float, double, boolean, char
//
//     Non-Primitive: Byte, Int, Long, Double Students...

    // Loop with an array
    val color = arrayOf("Red", "Blue", "Black", "White", "Orange")

    // Print each color
    for (c in color) {
        println(c)
    }
    println()

    // Print index numbers
    for (c in color.indices) {
        println(c)
        // or: print("$c ")
    }
    println()

    // Print color with its index ::: Traversing Arrays
    for (i in color.indices) {
        println("${color[i]} Index no: $i")
    }

    // array traversal using range
    val arrayname = arrayOf<Int>(1, 2, 3, 4, 5)
    for (i in 0..arrayname.size - 1) {
        println(arrayname[i])
    }

    // creating an array using a constructor
    val arrayname2 = Array(5, { i -> i * 1 })
    for (i in 0..arrayname.size - 1) {
        println(arrayname[i])
    }

//    array traversal using a foreach loop
    val arrayname3 = arrayOf<Int>(1, 2, 3, 4, 5)
    arrayname.forEach({ index -> println(index) })
}