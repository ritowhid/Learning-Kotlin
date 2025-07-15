package com.main.function

fun main() {
 printMyData()
}
var i = 0
fun printMyData() {
    i++
    println("$i-MyData")
    if (i<5)
    printMyData()
}