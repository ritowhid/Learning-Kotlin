package com.main.function
/*
    A function marked with the 'infix' keyword can also be called using 'infix' notation —
    meaning you can call it without using parentheses and dot.

    -> An infix method is a special kind of function that lets you call it using a cleaner,
       more readable syntax — without using dots (.) and parentheses (()).
       Instead, you write it between the object and the argument, like a natural language phrase.

    Types of 'infix' function:
        - Standard library infix function notation
        - User-defined infix function notation
*/

//====================== Standard Library Infix Functions (built-in) ================================
fun standardLibraryExamples() {
    println("=== Standard Library Infix Examples ===")

    val a = 15
    val b = 12
    val c = 11

    // 1. Using 'and' operator: dot call vs infix call
    val result1 = (a > b).and(a > c)        // dot notation
    val result2 = (a > b) and (a > c)       // infix notation
    println("Boolean result1 = $result1")   // true
    println("Boolean result2 = $result2")   // true

    // 2. Using 'shr' (signed shift right) operator
    val num = 8
    val shiftResult1 = num shr 2             // infix notation
    val shiftResult2 = num.shr(1)            // dot notation
    println("Signed shift right by 2 bits: $shiftResult1")  // 2
    println("Signed shift right by 1 bit: $shiftResult2")   // 4

    // 3. Increment and decrement operators (no infix but for demo)
    var x = 8
    var y = 4
    println(++x)      // 9 (infix style)
    println(x.inc())  // 10 (dot style)
    println(--y)      // 3 (infix style)
    println(y.dec())  // 2 (dot style)

    println()
}


//========================== User-Defined Infix Functions =========================================

// 1. Member infix function in a class
class MathOperations {
    infix fun square(n: Int): Int {
        return n * n
    }
}

// 2. Member infix function for checking data type
class Check {
    infix fun dataType(x: Any): String {
        return when (x) {
            is String -> "String"
            is Int -> "Integer"
            is Double -> "Double"
            else -> "Invalid"
        }
    }
}

fun main() {

    standardLibraryExamples()

        /*
        -> Create an instance 'm' of the class MathOperations
        -> Call the member infix function 'square' on 'm' with argument 3
        -> Because 'square' is declared with the 'infix' keyword, we can write:
           m square 3
           instead of the usual method call: m.square(3)
     */

    val m = MathOperations() 	// Creates a new object of class MathOperations and stores it in variable 'm'
    // Call using infix notation
    val res = m square 3        // Calls the infix function 'square' on reference variable - 'm' with argument 3
    println("Square of 3 is: $res") // res stores the return value of the function call:

    //--------------------------------------

    val checker = Check()   // Creates an object (instance) named 'checker' of the class Check
    // Call using infix notation
    val result = checker dataType 3.3  // Calls the infix function 'dataType' on reference variable - 'checker' with 3.3 as argument
    println("Data Type of 3.3 is: $result")

}