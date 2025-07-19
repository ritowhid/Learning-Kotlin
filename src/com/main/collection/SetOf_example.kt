package com.main.collection

//setOf() function returns a new read-only set containing the given elements.
// The elements are iterated in the order they are stored
fun main() {
    val set = setOf("Geeksforgeeks", "Gfg", 1, 2, 3, 4, 5)
    for (element in set) {
        println(element)
    }

    // set indexing
    val s = listOf("Branch", "Leaf", "Root", "Stem", "Root")
    println("The element at index 2 is: ${set.elementAt(2)}")
    println("The index of element is: ${set.indexOf("Leaf")}")
    println("The last index of element is: ${set.lastIndexOf("Root")}")
    println("The first element: ${set.first()} and the last element: ${set.last()}")


    val num = setOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(
        "The number of element in set: ${num.count()}" +
                "\nMax num: ${num.max()}" +
                "\nMin num: " + num.min() +
                "\nSum of num: " + num.sum() +
                "\nAverage of num: " + num.average() +
                "\nSet Contains 10?: ${num.contains(10)}" +
                "\nSet Contains 5?: " + num.contains(5) +
                "\nSet Contains All 1,2,3,4: ${num.containsAll(listOf(1, 2, 3, 4))}"
    )

    val fruits = setOf("apple", "banana", "cherry")
    println("Fruits: $fruits")
    println("Does the set contain an apple? ${fruits.contains("apple")}")
    println("Does the set contain an orange? ${fruits.contains("orange")}")

    for (fruit in fruits) {
        println(fruit)
    }
}