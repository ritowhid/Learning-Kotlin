package com.main.function

/*
    Higher-order function: A function that takes another function as a parameter.

    - Syntax of Lambda expression:
      val lambda_name: Data_type = { argument_List -> code_body }

      lambda expression contains an optional part except for the code_body.
      after eliminating the optional part:
      val sum:(Int,Int) -> Int = { a, b -> a + b}

    - Named function: fun functionName(...) { ... }
*/

// Normal function that returns sum of two numbers
fun sumVal(i: Int, j: Int): Int {
    return i + j
}

// Higher-order function (lambda as last parameter)
fun sumVal2(i: Int, j: Int, myOutput: (Int) -> Unit) {
    val result = i + j
    myOutput(result)
}

// Higher-order function (lambda in the middle)
fun sumVal3(i: Int, myOutput: (Int) -> Unit, j: Int) {
    val r = i + j
    myOutput(r)
}

// Higher-order function with a lambda that takes two arguments (Int and String)
fun sumVal4(i: Int, myOutput: (Int, String) -> Unit, j: Int) {
    val r = i + j
    myOutput(r, " Compilation done..")
}

// Higher-order function: lambda returns a value (non-Unit)
fun sumVal5(i: Int, myOutput: (Int, String) -> Int, j: Int) {
    val result = i + j
    val finalResult = myOutput(result, " Compilation done...finally")
    println("Returned from lambda in sumVal5: $finalResult")
}

// Named function
fun namedPrinter(result: Int) {
    println("Sum from named function: $result")
}

fun main() {
    // Call a normal function
    val res = sumVal(4, 5)
    println("Sum from normal function: $res")

    // Call a higher-order function (Lambda as last parameter) (call with lambda expression; anonymous lambda)
    sumVal2(4, 6) { result ->
        println("Sum from lambda function: $result")  // { result -> println(...) } is an anonymous lambda passed directly.
    }

    // Call a higher-order function (lambda is the middle parameter)
    sumVal3(4, { println("Sum from sumVal3: $it") }, 7)

    // Call a higher-order function with lambda that takes 2 arguments
    sumVal4(4, { sum, msg -> println("Sum from sumVal4: $sum$msg") }, 8)

    // Call a higher-order function with lambda that returns a value (non-Unit)
    sumVal5(3, { sum, msg ->
        println("Sum from sumVal5 (inside lambda): $sum$msg")
        sum * 2 // returning an Int
    }, 9)


    // Call with Anonymous Function (non-lambda)
    val anonFun = fun(result: Int) {
        println("Sum from anonymous function: $result")
    }
    sumVal2(7, 8, anonFun)

    // Call with Named Function
    sumVal2(10, 20, ::namedPrinter)

}