package com.main.collection

fun main(args: Array<String>) {
    // initialize with duplicate values, in output no repetition
    val immutableSet = setOf(6, 9, 9, 8, 8, "Mohipal", "Feni")

    //immutableSet.add(7) error: compile time

    for (item in immutableSet) {
        println(item)
    }
}