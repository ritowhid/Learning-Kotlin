package com.main.oops

/*
    -> properties are meant to be a first-class language feature.
       These features replace fields and accessor methods

    -> val: Read-only property (generates only a getter)
    -> var: Read-write property (generates a getter and setter)

    -> This code also demonstrates **Encapsulation**:
       - Internal data (like 'age') is protected using custom accessors.
       - Access to fields is controlled, hiding implementation details.
 */

class Abc(
    // Simple data class with read-only properties
    // Not full encapsulation, but uses val to make fields immutable
    val name: String,
    val ispassed: Boolean
)


// custom accessors (Getter and Setter)
// Custom getter to derive a property from internal state
// Demonstrates encapsulation via controlled read access
// custom getter
class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = width == height
}

// custom setter
// Encapsulation Example:
// Custom setter used to validate input and protect the internal state
class PersonWithAge {
    var age: Int = 0
        set(value) {
            if (value > 0) field = value
            else println("Age must be positive")
        }
}

fun main(args: Array<String>) {
    val abc = Abc("Bob", true)
    println(abc.name)
    println(abc.ispassed)

    // custom getter
    val rect = Rectangle(10, 20)
    println(rect.isSquare)

    // custom setter (encapsulation in action)
    val p = PersonWithAge()
    p.age = -5
    p.age = 30
    println(p.age)
}
