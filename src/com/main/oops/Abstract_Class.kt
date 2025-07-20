package com.main.oops

// abstract class cannot be instantiated
// abstract class can have both abstract and non-abstract methods and properties
// if a class has abstract method or property, then class must be declared.

abstract class ShapeClass {
    abstract fun area(): Double
    abstract fun printMe()
}

class CircleClass(val radius: Double) : ShapeClass() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun printMe() {
        println("you print me in circle class")
    }
}

abstract class AnotherAbstract {
    abstract fun printMe()
    fun printRandomNum() {
        println("Random num generated")
    }
}

fun main() {
    val circle = CircleClass(4.0)
    println(circle.area())
    circle.printMe()
}