package com.main.collection

// Since mutable, list supports read and write operation, declared
// elements in the list can either be removed or added.
// List - mutableListOf(),arrayListOf() and ArrayList
fun main(args: Array<String>) {
    val mutableList = mutableListOf("Hello", "Rakibul", "Islam")
    // we can modify the element
    mutableList[0] = "Towhid"
    // add one more element in the list
    mutableList.add("Hi")
    for (item in mutableList) {
        println(item)
    }
}