package com.main.oops

// Base interface with a property and abstract methods
interface VehicleSE {
    val vehicleType: String // Abstract property
    fun start()
    fun stop()
}

// Interface with a default method
interface Fuelable {
    val fuelLevel: Int // Abstract property
    fun checkFuel() { // Default implementation
        println("Fuel level: $fuelLevel%")
    }
}

// Interface inheriting from Vehicle
interface ElectricVehicle : VehicleSE {
    val batteryCapacity: Int // Abstract property
    fun charge() { // Default implementation
        println("$vehicleType is charging with $batteryCapacity kWh capacity.")
    }
}

// Class implementing multiple interfaces (ElectricVehicle and Fuelable)
class ElectricCar : ElectricVehicle, Fuelable {
    // Implement properties from Vehicle
    override val vehicleType: String = "Electric Car"

    // Implement properties from ElectricVehicle
    override val batteryCapacity: Int = 75

    // Implement properties from Fuelable
    override val fuelLevel: Int = 80 // Representing battery charge level

    // Implement methods from Vehicle
    override fun start() {
        println("$vehicleType started with $fuelLevel% charge.")
    }

    override fun stop() {
        println("$vehicleType stopped.")
    }

    // Override default method from Fuelable for custom behavior
    override fun checkFuel() {
        println("$vehicleType battery level: $fuelLevel%")
    }
}

fun main() {
    val myCar = ElectricCar()
    println("Vehicle Type: ${myCar.vehicleType}")
    myCar.start()
    myCar.checkFuel()
    myCar.charge()
    myCar.stop()
}