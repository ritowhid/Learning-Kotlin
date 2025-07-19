package com.main.collection
// Set is a generic unordered collection of elements that does not allow duplicate elements.
fun main() {
    // Create a mutable set of fruits
    val fruits = mutableSetOf("apple", "banana", "cherry")

    // Add a new fruit to the set
    fruits.add("orange")
    println("Fruits after adding orange: $fruits")

    // Remove a fruit from the set
    fruits.remove("banana")
    println("Fruits after removing banana: $fruits")

    // Check if the set contains a particular fruit
    val hasApple = fruits.contains("apple")
    val hasMango = fruits.contains("mango")
    println("Fruits contains apple: $hasApple")
    println("Fruits contains mango: $hasMango")

    // We can iterate over a mutable set using a for loop:
    // traversal of seta using an iterator 'item'
    // Iterate over the elements of the set
    println("Fruits:")
    for (fruit in fruits) {
        println("- $fruit")
    }
}