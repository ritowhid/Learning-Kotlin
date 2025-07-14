package com.main.basic_Kt

fun main() {
    val a = 3
    val b = 2

    // Using simple if statement
    var max: Int = a
    if (a < b) max = b

    // Using if-else block
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // Using if as an expression (like ternary)
    max = if (a > b) a else b

    // Using else-if inside an expression
    val maxLimit = 1
    val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b

    // Print max values
    println("max is $max")
    println("maxOrLimit is $maxOrLimit")

    // if expression with print inside
    val chosenMax = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    println("chosenMax is $chosenMax")

    // when as an expression (returns a value)
    val x = 2
    val text = when (x) {
        1 -> "x == 1"
        2 -> "x == 2"
        else -> "x is neither 1 nor 2"
    }
    println(text) // Output: x == 2

    // when as a statement (performs action - need print in condition)
    val y = 5;
    when (y) {
        1 -> print("y == 1")
        2 -> print("y == 2")
        5 -> print("y = 5")
        else -> print("y is neither 1 nor 2")
    }
    /*  With subject x:
            when(x) { ... }

        Without subject:
            when { ... }
      */
    val i = 4;
    val myLogic: Boolean = i != 2;
    if (myLogic) println("Hello")

    val myValue = 3
    val myValue2 = 7
    val myResult = if (myValue < myValue2) {
        "Value 1 is < value 2"
    } else {
        "Value 2 is > value 2"
    }
    println(myResult)
}
