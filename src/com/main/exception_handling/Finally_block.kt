package com.main.exception_handling

fun main() {
    try {
        val arr = arrayOf(1, 2, 3, 4, 5)
        println(arr[6])
    } finally {
        println("\nThis block always executes..!!\n")
    }
}
