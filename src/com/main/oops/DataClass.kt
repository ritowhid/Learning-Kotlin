package com.main.oops

// Data class for Customer
data class Customer(val name: String, val orderId: Int) {
    var store: String = "Unknown" // property in class body, not in primary
}

fun main() {
    // Create a customer object
    val customer1 = Customer("Emma", 1001)
    customer1.store = "City Mall"

    // Demonstrate toString()
    println("Customer 1: $customer1") // Only name and orderId are included in toString()
    println("Store: ${customer1.store}") // store is separate

    // Demonstrate copy()
    val customer2 = customer1.copy(name = "Liam") // Copy with a different name
    customer2.store = "Downtown Shop" // Change store for customer2
    val customer3 = customer1.copy() // Exact copy of customer1
    customer3.store = "Online Store" // Change store for customer3

    println("\nAfter copying:")
    println("${customer1.name}, Order ID: ${customer1.orderId}, Store: ${customer1.store}")
    println("${customer2.name}, Order ID: ${customer2.orderId}, Store: ${customer2.store}")
    println("${customer3.name}, Order ID: ${customer3.orderId}, Store: ${customer3.store}")

    // Demonstrate equals() and hashCode()
    val customer4 = Customer("Emma", 1001) // Same primary constructor values as customer1
    println("\nHash codes:")
    println("customer1 hash: ${customer1.hashCode()}")
    println("customer2 hash: ${customer2.hashCode()}")
    println("customer4 hash: ${customer4.hashCode()}")

    println("\nEquality checks:")
    println("customer1 == customer2: ${customer1 == customer2}") // Different name, so false
    println("customer1 == customer4: ${customer1 == customer4}") // Same name and orderId, so true
}