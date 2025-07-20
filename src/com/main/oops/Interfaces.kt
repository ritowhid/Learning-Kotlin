package com.main.oops

/*
 -> An interface is like a blueprint for a class. It cannot create objects by itself,
    but it tells other classes what they should do.
 -> An interface can have:
    - Method declarations without code
    - Methods with default code
    - Property declarations(no stored data)
    - Custom getters (but no variables inside)
    - Default values for method parameters

 -> You can’t create an object from an interface directly.
    It can’t store data (no backing fields like var name = "John").
 */
interface Vehicle {
    fun start()
    fun stop()
}

// Implementation of the Vehicle interface
class Car : Vehicle {
    // Override all abstract members:
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }
}

fun main() {
    val myCar = Car()
    myCar.start()
    myCar.stop()
}