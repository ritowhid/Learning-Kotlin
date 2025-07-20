package com.main.oops

class Obj_Class_example {
    var brand: String = " "
    var model: String = " "
    var year: Int = 0

    fun getInfo(): String {
        return "$brand, $model, year: $year"
    }
}

class Employee(val name: String, val age: Int, val gender: Char, val salary: Double) {
    fun showDetails() {
        println("Name of the employee: $name")
        println("Age of the employee: $age")
        println("Gender of the employee: $gender")
        println("Salary of the employee: $salary")
    }
}

fun main() {
    val objCar = Obj_Class_example()
    objCar.brand = "Toyota"
    objCar.model = "Camry"
    objCar.year = 2020

    println(objCar.getInfo())

    val emp1 = Employee("Praveen", 50, 'M', 500000.0)
    emp1.showDetails()

    val emp2 = Employee("Aliena", 30, 'F', 400000.0)
    println("Name of the new employee: ${emp2.name}")
}