package com.main.basic_Kt

fun main(args: Array<String>) {
    println("This is my Value: ${args[0]}-${args[1]}")
}
/* -> Kotlin's main(args: Array<String>) function expects external input,
      and the IDE doesn’t know what you want to pass unless you tell it explicitly.

   -> command-line arguments are meant to be provided from outside, not hardcoded.
 */