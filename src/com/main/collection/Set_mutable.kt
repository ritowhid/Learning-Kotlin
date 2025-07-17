package com.main.collection

// mutable Set supports both read and write functionality. We can access add or remove elements
// from the collections easily and it will preserve the order of the elements.
// Set - mutableSetOf(), hashSetOf()
fun main(args: Array<String>) {
    var mutableSet = mutableSetOf<Int>(6, 10)
    // adding elements in a set
    mutableSet.add(2)
    mutableSet.add(5)
    for (item in mutableSet) {
        println(item)
    }
}