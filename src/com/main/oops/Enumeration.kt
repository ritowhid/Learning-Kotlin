package com.main.oops
// enum class cannot inherit from classes


enum class Color {
    Red,
    Green,
    Blue,
    Orange
}

// enum constructor
enum class Bike(val bikeName: String, val bikePrice: Int) {
    Yamaha("R15", 5),
    Honda("CBR", 4),
    Suzuki("Gixxer", 3)
}


// enum with interface:
// interface declaration
interface Payable {
    fun pay(amount: Double)
}

// Enum implementing the interface
enum class PaymentMethod : Payable {
    CreditCard {
        override fun pay(amount: Double) {
            println("Paid $amount using credit card.")
        }
    },
    Paypal {
        override fun pay(amount: Double) {
            println("Paid $amount via PayPal.")
        }
    },
    Cash {
        override fun pay(amount: Double) {
            println("Paid $amount in Cash.")
        }
    }
}

fun main() {
    Color.values().forEach { println(it) }

    // enum with when
    val color = Color.Red
    when (color) {
        Color.Red -> println("Red")
        Color.Blue -> println("Blue")
        Color.Green -> println("Green")
        Color.Orange -> println("Orange")
    }

    // print enum constructor
    println("Bike model: " + Bike.Yamaha.bikeName)
    println("Bike Price (lakh): " + Bike.Yamaha.bikePrice)

    // interface enum printing
    val money = 250.0

    val method1 = PaymentMethod.CreditCard
    val method2 = PaymentMethod.Paypal
    val method3 = PaymentMethod.Cash

    method1.pay(money)
    method2.pay(money)
    method3.pay(money)
}