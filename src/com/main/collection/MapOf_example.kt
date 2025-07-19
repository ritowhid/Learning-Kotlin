package com.main.collection

/*
Map is a collection that stores data in key-value pairs.
Each key in a map is unique, and the map holds only one value for each key.
If a key is repeated, only the last value is retained.

-> Immutable maps (mapOf()) - read-only
-> Mutable maps (mutableMapOf()) - read and write supported
 */
fun main() {
    val map = mapOf(1 to "Geeks", 2 to "for", 3 to "Geeks")
    println(map)

    // accessing Keys, Values, and Entries
    val mpp = mapOf(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four")
    println("Map Entries : $mpp")
    println("Map Keys: " + mpp.keys)
    println("Map Values: " + mpp.values)

    // determine the 'Map Size'
    val ranks = mapOf(1 to "Bangladesh", 2 to "Australia", 3 to "England", 4 to "Africa")
    println("The size of the map: " + ranks.size)
    println("The size of the map: " + ranks.count())

    // getting values from Map
    //method 1
    println("team having rank #1 is: " + ranks[1])
    //method 2
    println("Team having rank #3 is: " + ranks.getValue(3))
    //method 3
    println("Team having rank #4 is: " + ranks.getOrDefault(4, 0))
    // method  4
    val team = ranks.getOrElse(2, { 0 })
    println(team)

    // Empty Map
    val mpp2 = mapOf<String, Int>()
    println("Entries: " + mpp2.entries)  //entries of map
    println("Keys:" + mpp2.keys)  //keys of map
    println("Values:" + mpp2.values)  //values of map

    //Map Contains Key or Values -
    val colorsTopToBottom =
        mapOf("red" to 1, "orange" to 2, "yellow" to 3, "green" to 4, "blue" to 5, "indigo" to 6, "violet" to 7)

    var color = "Yellow"
    if (colorsTopToBottom.containsKey(color)) {
        println("Yes, it contains color $color")
    } else {
        println("No, it does not  contain color $color")
    }
    val value = 8
    if (colorsTopToBottom.containsValue(value)) {
        println("yes, it contains value $value")
    } else {
        println("No, it does not contain value $value")
    }


    // using mapOf() to create a map of strings:
    val names = mapOf("John" to 25, "Mary" to 30, "Bob" to 20)
    // get the value associated with a key
    val johnAge = names["John"]
    println(johnAge)
    // check if a key is present in the map
    val containsMary = names.containsKey("Mary")
    println(containsMary)
    // print the map and the result of the contains check
    println("Names: $names")


    // If two values have same key value ,
    // then the map will contain the last value of the those numbers.
    val mp = mapOf(
        1 to "geeks1",
        2 to "for",
        1 to "geeks2"
    )
    println("Entries of map : " + mp.entries)
}