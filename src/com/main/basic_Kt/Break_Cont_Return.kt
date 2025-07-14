package com.main.basic_Kt

fun main() {
    // Use-case: 'continue' (skip current iteration)
    for (i in 1..10) {
        if (i == 5) {
//            break
            continue // will ignore 5
        }
        println("value $i")
    }

    // Skipping iterations using 'return'
    val computer = arrayOf("Mac", "Dell", "Asus", "Lenovo")
    computer.forEach {
        if (it == "Dell") return@forEach
        println(it)
    }

// return - continue; Use-case: return@forEach in nested loops (skip inner iteration)
    val comp = arrayOf("Mac", "Dell", "Hp")

    comp.forEach { outer ->
        println("Outer: $outer")

        comp.forEach { inner ->
            if (inner == "Hp") return@forEach  // Skip "Hp" in inner loop
            println("  Inner: $inner")
        }
        println("End of outer: $outer\n")
    }

//===========================================================================
    // break using run; Use-case: labeled return (simulate break in forEach)
    val items = listOf("Apple", "Banana", "Cherry", "Date")

    run breaking@{
        items.forEach {
            if (it == "Cherry") {
                println("Found Cherry! Simulating break.")
                return@breaking // exits the lambda scope of run{}
            }
            println("Item: $it")
        }
    }
}