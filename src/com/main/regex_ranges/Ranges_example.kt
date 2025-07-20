package com.main.regex_ranges

/*
  -> A range represents a continuous sequence of values between a start and an end, inclusive
    -> There are three ways for creating Range in Kotlin:
       - Using the .. operator
       - Using rangeTo() function
       - Using downTo() function
 */

fun main() {
    // 1. Int range from 1 to 5
    val intRange = 1..5
    println("Int Range: $intRange") // prints 1..5

    // 2. Check if a value is in the range
    val x = 3
    if (x in intRange) {
        println("$x is within the range 1 to 5")
    }

    // 3. Iterate over the range
    print("Iterate from 1 to 5: ")
    for (i in intRange) {
        print("$i ")
    }
    println()

    // 4. Char range from 'a' to 'e'
    val charRange = 'a'..'e'
    println("Char Range: $charRange")

    // 5. Check if char is in the range
    val ch = 'c'
    if (ch in charRange) {
        println("$ch is in the range a to e")
    }

    // 6. Descending range (using downTo)
    val descending = 5 downTo 1
    print("Descending range: ")
    for (num in descending) {
        print("$num ")
    }
    println()

    // 7. Range with step (skip numbers)
    val stepRange = 1..10 step 2
    print("Range with step 2: ")
    for (num in stepRange) {
        print("$num ")
    }
    println()

    // 8. Using rangeUntil (until but excluding end)
    val untilRange = 1 until 5
    print("Range using until (1 until 5): ")
    for (num in untilRange) {
        print("$num ")
    }
    println()
}
