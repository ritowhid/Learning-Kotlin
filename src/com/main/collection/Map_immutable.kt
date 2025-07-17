package com.main.collection

// Map keys are unique and hold only one value for each key.
fun main(args: Array<String>) {
    val immutableMap = mapOf(9 to "rakibul", 8 to "islam", 7 to "towhid")

    // immutableMap.put(9, "hi") error: compile time
    for (key in immutableMap.keys) {
        println(immutableMap[key])
    }
}