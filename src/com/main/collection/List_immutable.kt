package com.main.collection
// the content of the List are fixed or constant after declaration
fun main() {
    val numbers = listOf('1', '2', '3')
    println(numbers.size)
    println(numbers.indexOf('2'))
    println(numbers[2])

    val names = listOf("C", "C++", "Java", "Kotlin", "C#")
    println("list size: ${names.size}")
    println("Index of 'Java': ${names.indexOf("Java")}")
    println("element at inedx 2: ${names[2]}")

    for (i in names.indices) {
        println(names[i])
    }

    val num = listOf(1, 2, 3, 4, 5, 1, 3, 4, 7, 4)
    println(num.get(0))
    println(num[7])
    println("first index of 1: ${num.indexOf(1)}")
    println("last index of 1: ${num.lastIndexOf(1)}")
    println("last index in list: ${num.lastIndex}")
    println("first number: ${num.first()}")
    println("last number: ${num.last()}")


    val str = listOf("C", "C++", "Java", "Kotlin", "C#", "Go lang", "javascript", "SpringBoot")
    // method 1: simple for loop
    for (strs in str) {
        print("$str, ")
    }
    println()

    // method 2: using indices
    for (i in 0 until str.size) {
        print("${str[i]}")
    }
    println()

    // method 3: using forEachIndexed
    str.forEachIndexed { index, value -> println("string[$index] = $value") }

    // method 4: using listIterator
    val it = str.listIterator()
    while (it.hasNext()) {
        print("${it.next()} ")
    }

    // sorting element
    val lst = listOf(3, 2, 5, 6, 2, 9, 3, 1, 0, 4, 9, 7)
    val ascending = lst.sorted()
    println(ascending)

    val descending = lst.sortedDescending()
    println(descending)

    // checking elements; contains() and containsAll() functions
    val list = listOf(8, 4, 7, 1, 2, 3, 0, 5, 6)

    if (list.contains(0))
        println("List contains 0")
    else
        println("List does not contain 0")

    if (list.containsAll(listOf(3, -1)))
        println("List contains 3 and -1")
    else
        println("List does not contain 3 and -1")
}