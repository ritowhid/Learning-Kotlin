package com.main.collection

// It is mutable, so it supports functionalities like put, remove, clear, etc.
// Map - mutableMapOf(), hashMapOf() and HashMap
fun main(args: Array<String>) {
    var mutableMap = mutableMapOf<Int, String>(1 to "bok", 2 to "aka", 3 to "rak")
    // we can modify the element
    mutableMap.put(1, "Lax")
    // add one more element in the list
    mutableMap.put(4, "van")
    for (item in mutableMap.values) {
        println(item)
    }
}