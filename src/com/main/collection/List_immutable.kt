package com.main.collection

fun main(args: Array<String>) {
    val immutableList = listOf<String>("Rakibul", "Islam", "Towhid")

    // gives compile time error
    // immutableList.add = "lax"
    for (item in immutableList) {
        println(item)
    }
}