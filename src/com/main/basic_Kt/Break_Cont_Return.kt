package com.main.basic_Kt
/*
    -> Unlabeled: A normal break, continue, or return that applies to the nearest loop or function.
       It doesn't use a label name.
       - Controls the nearest loop or lambda
    -> Labeled: You give a name (label) to a loop or block. Then use that name with @ to control
       exactly which loop/block you want to break, continue, or return from.
       - Gives you manual control over which block to affect

 */
fun main() {
    // Use-case: 'continue' (skip current iteration)
    for (i in 1..10) {
        if (i == 5) {
//            break
            continue // will ignore 5 -> Unlabeled continue
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
                return@breaking // exits the lambda scope of run{} // Labeled break using `run` block
            }
            println("Item: $it")
        }
    }


//Used to skip outer loop iteration from inner loop.
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (j == 2) continue@outer // This skips to next `i`
            println("i=$i, j=$j")
        }
    }

}