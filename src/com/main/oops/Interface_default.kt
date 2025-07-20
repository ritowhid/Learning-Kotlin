package com.main.oops

// Define an interface with a default implementation
interface Appliance {
    // Abstract method (must be implemented)
    fun turnOn()

    // Method with default implementation
    fun turnOff() {
        println("Appliance turned off (default behavior)")
    }

    // Property with a default getter
    val name: String
        get() = "Generic Appliance"
}

// Implementation of the Appliance interface
class CoffeeMaker : Appliance {
    // Override the abstract method
    override fun turnOn() {
        println("Coffee Maker is brewing coffee!")
    }

    // Override the property
    override val name: String
        get() = "Coffee Maker"

    // Optionally override the default method (custom behavior)
    override fun turnOff() {
        println("$name stopped brewing.")
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker()
    println("Appliance Name: ${coffeeMaker.name}")
    coffeeMaker.turnOn()
    coffeeMaker.turnOff()
}