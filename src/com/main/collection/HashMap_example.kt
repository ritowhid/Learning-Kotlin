package com.main.collection

//HashMap is a collection that stores key-value pairs, where each key must be unique,
// but values can be duplicated.
// It is a hash table based implementation of the MutableMap interface.
fun main() {
    val hashMap: HashMap<String, Int> = HashMap<String, Int>()

    // print the empty hashmap
    println(hashMap)
    // use put() to add elements
    hashMap.put("IronMan", 3000)
    hashMap.put("Thor", 100)
    hashMap.put("SpiderMan", 1100)
    hashMap.put("NickFury", 1200)
    hashMap.put("HawkEye", 1300)

    // print the non-empty hashMap
    println("hashMap : $hashMap\n")

    // traverse hashMap using for loop
    for (key in hashMap.keys) {
        println("Element at key $key  : ${hashMap[key]}")
    }

    // creating another hashMap obj  with the  previous version of hashMap object
    var secondHashMap : HashMap<String, Int> = HashMap<String, Int>(hashMap)

    println("\n" + "Second hashMap: ")
    for (key in  secondHashMap.keys) {
        // using hashMap.get() function to fetch the values
        println("Element at key $key: ${hashMap.get(key)}")
    }

    //this will clear the whole map and make it empty
    println("hashMap.clear()")
    hashMap.clear()

    println("After Clearing : $hashMap")


    //=================================================================
    // Create a HashMap with an initial capacity of 5
    val students = HashMap<String, Int>(5)

    // put(): Add key-value pairs
    students.put("Alice", 80)
    students.put("Bob", 75)
    students.put("Clara", 90)

    // size: Get the total number of entries
    println("Total students: ${students.size}")  // Output: 3

    // get(): Get value by key
    println("Marks of Alice: ${students.get("Alice")}")  // Output: 80

    // replace(): Update value for a key
    students.replace("Bob", 85)
    println("Updated marks of Bob: ${students.get("Bob")}")  // Output: 85

    // Show final map
    println("Final student map: $students")

}