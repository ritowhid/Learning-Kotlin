package com.main.collection

// We use ArrayList to access the index of the specified element,
// convert an Arraylist into string or another array and many more functionalities.

fun main() {
    // Creating an empty ArrayList of Strings
    val arrlist = ArrayList<String>()

    // Example using arrayListOf()
    val arrlist2 = arrayListOf("C", "C++", "Java")
    println("ArrayList created using arrayListOf(): $arrlist2")

    // --- 1. add(element) ---
    arrlist.add("Geeks")
    arrlist.add("For")
    arrlist.add("Geeks") // duplicate allowed
    println("After add(): $arrlist")

    // --- 2. add(index, element) ---
    arrlist.add(1, "Kotlin") // Inserts at index 1
    println("After add(index, element): $arrlist")

    // --- 3. addAll(collection) ---
    val newItems = arrayListOf("Java", "Python")
    arrlist.addAll(newItems)
    println("After addAll(): $arrlist")

    // --- 4. get(index) ---
    println("Element at index 2: ${arrlist.get(2)}")

    // --- 5. set(index, element) ---
    arrlist.set(2, "Android") // Replaces element at index 2
    println("After set(): $arrlist")

    // --- 6. indexOf(element) ---
    val index = arrlist.indexOf("Geeks") // First occurrence
    println("Index of 'Geeks': $index")

    // --- 7. remove(element) ---
    arrlist.remove("Geeks") // Removes first match
    println("After remove(element): $arrlist")

    // --- 8. removeAt(index) ---
    arrlist.removeAt(0) // Removes by index
    println("After removeAt(0): $arrlist")

    // --- 9. clear() ---
    arrlist.clear() // Removes all elements
    println("After clear(): $arrlist")

    // --- 10. isEmpty() ---
    println("Is arrlist empty? ${arrlist.isEmpty()}")

    // --- 11. size ---
    println("Size of arrlist: ${arrlist.size}")

    // --- 12. contains(element) ---
    println("Does arrlist2 contain 'Java'? ${arrlist2.contains("Java")}")
    println("Does arrlist2 contain 'Python'? ${arrlist2.contains("Python")}")

    // --- 13. toString() ---
    println("arrlist2 as string: ${arrlist2.toString()}")
}
