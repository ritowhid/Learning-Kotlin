package com.main.oops

/*
    A person at the same time can have different characteristics.
    Like a man at the same time is a father, a husband, an employee.
    So the same person possesses different behavior in different situations.

    -> polymorphism: parent class can hold the reference of its child class.
       parent class can call method of its child class, which is overridden or common in both
 */

// runtime polymorphism
open class Parent {
    open fun display() {
        println("Display from Parent")
    }
}

class Child : Parent() {
    override fun display() {
        println("Display from Child")
    }
}

// compile time
class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

fun main() {
    val parent: Parent = Child() // Parent class reference holding Child object
    parent.display() // Calls the overridden method from Child


    val calc = Calculator()
    println(calc.add(2, 3))        // Calls add(Int, Int)
    println(calc.add(2.5, 3.5))    // Calls add(Double, Double)
    println(calc.add(2, 3, 4))     // Calls add(Int, Int, Int)
}