package com.main.oops

/*
    -> A constructor is a special member function that is automatically called when an object of a class
       is created. Its main purpose is to initialize properties or perform setup operations

    -> Types of Constructor:
       - Primary Constructor,
       - Secondary Constructor
    A class can have only one primary constructor, but multiple secondary constructors.

    -> Initializer Block (init block)
       The primary constructor cannot contain any logic. To execute code during object initialization,
       Kotlin provides the init block.
 */

// example of primary constructor
class Add(val a: Int, val b: Int) {
    val c = a + b
}


// The primary constructor cannot contain any logic.
// To execute code during object initialization, Kotlin provides the init block.
class PersonWithName(val name: String) {
    init {
        println("first block")
    }

    init {
        println("second block")
    }

    init {
        println("third block")
    }
}

class EmployeeConstructor(val empId: Int = 100, val empName: String = "abc")


// Secondary Constructor
class AddNum {
    var c: Int = 0

    constructor(a: Int, b: Int) {
        c = a + b
        println("The sum of numbers $a and $b is: $c")
    }
}

// Multiple Secondary Constructors
class EmployeeMultiple {
    constructor(empId: Int, empName: String) {
        println("Employee id is: $empId, Employee name: $empName")
    }

    constructor(empId: Int, empName: String, salary: Double) {
        println("Employee id is: $empId, Employee name: $empName, Salary: $salary")
    }
}


// call secondary constructor from another
class AddMultiple {
    constructor(a: Int, b: Int, c: Int) {
        println("Sum of $a, $b, $c = ${a + b + c}")
    }

    constructor(a: Int, b: Int) : this(a, b, 7) {
        println("Sum of two numbers $a and $b is: ${a + b}")
    }
}

// Call parent class constructor from child class
//open class is an ordinary class that is open for extension. By default, when we write a class
// in Kotlin, it cannot be extended. Yes, inheritance is prevented by default.
open class EmployeeParentClass {
    constructor(empId: Int, empName: String) {
        println("Employee id is: $empId")
        println("Employee name: $empName")
    }
}
class Manager : EmployeeParentClass {
    constructor(empId: Int, empName: String, salary: Double) : super(empId, empName) {
        println("Employee salary: $salary")
    }
}
fun main() {
    val add = Add(5, 6)
    println("The sum of two  numbers is: ${add.c}")

    val person = PersonWithName("geeks")
    println("name: ${person.name}")


    // employee class calling
    val emp1 = EmployeeConstructor(18018, "Sagnik")
    val emp2 = EmployeeConstructor(11011)
    val emp3 = EmployeeConstructor()

    println("Employee id is: ${emp1.empId}, Employee name: ${emp1.empName}")
    println("Employee id is: ${emp2.empId}, Employee name: ${emp2.empName}")
    println("Employee id is: ${emp3.empId}, Employee name: ${emp3.empName}")

    // secondary constructor calling
    val sum = AddNum(5, 6)

    // multiple employee constructor call
    val e1 = EmployeeMultiple(18018, "Sagnik")
    val e2 = EmployeeMultiple(11011, "Praveen", 600000.5)

    // calling secondary constructor from another
    val adding = AddMultiple(2,4,6)

    // Inheritance: child calling parent constructor
    val manager = Manager(18018, "Sagnik", 500000.55)
}