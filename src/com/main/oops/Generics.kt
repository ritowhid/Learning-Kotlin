package com.main.oops

// write flexible, reusable, and type-safe code
// with generics we can define classes, methods, and properties

class ElementFinder<T>(private val arr: Array<T>) {
    fun findElement(element: T, foundElement: (index: Int, element: T?) -> Unit) {
        for (i in arr.indices) {
            if (arr[i] == element) {
                foundElement(i, arr[i])
                return
            }
        }
        foundElement(-1, null)
        return
    }
}

// Function to find an element in an array and call a callback with the result
fun <T> findElementInArray(arr: Array<T>, element: T, foundElement: (index: Int, element: T?) -> Unit) {
    for (i in arr.indices) {
        if (arr[i] == element) {
            foundElement(i, arr[i])
            return
        }
    }
    foundElement(-1, null)  // Element not found
}


//--
fun <X, Y> justForTesting(param1: X, param2: Y) {
    println("$param1 and $param2")
}

fun main() {
    val arrFinder = ElementFinder<Int>(arrayOf(1, 2, 3, 4, 5))
    val arrFinder2 = ElementFinder<String>(arrayOf("1", "2", "3", "4", "5"))

    arrFinder.findElement(3) { index, element ->
        println("Index $index")
        println("Element $element")
    }

    //----------
    findElementInArray(arrayOf(1, 2, 3, 4, 5), 4) { index, element ->
        println("index $index")
        println("element $element")
    }

    //---
    justForTesting<String, Int>("3", 5)
}