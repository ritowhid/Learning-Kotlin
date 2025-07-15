package com.main.function

fun main() {
    namedArguments(myName = "Towhid", myID = 5)
}

fun namedArguments(myName: String = "", myID: Int = 0) {
    println("Name: $myName, ID: $myID")
}