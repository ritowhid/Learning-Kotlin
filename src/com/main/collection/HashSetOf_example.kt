package com.main.collection

//HashSet is a generic, unordered collection that holds unique elements only.
//It does not allow duplicates
fun main() {
// we can use add, addAll, remove method

    val set = hashSetOf<Int>()
    println(set)
    set.addAll(listOf(1, 2, 3, 4, 5))
    println(set)
    set.add(6)
    set.remove(2)
    println(set)
    println("The last index of element is: " + set.lastIndexOf(5))
    set.contains(5)

    //HashSet can be traversed using an iterator or in a for loop:
    for (item in set) {
        println(item)
    }

}