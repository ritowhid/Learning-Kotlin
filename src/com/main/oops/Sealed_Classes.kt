package com.main.oops

/*
  -> sealed classes are designed to be extended - not instantiated on their own.
  -> sealed class constructors are protected by default, so you can’t access them
     outside the class or its subclasses.

  -> curly braces are optional for classes (including sealed classes) when the
     class body is empty.
 */
sealed class Demo {
    class A : Demo() {
        fun display() {
            println("Subclass A of Sealed class Demo ")
        }
    }

    class B : Demo() {
        fun display() {
            println("Subclass B of sealed class Demo")
        }
    }
}


// sealed class wih when
sealed class Fruit // it is an empty sealed class with no properties, methods, or inner

// declarations defined directly within it
class Apple : Fruit()
class Mango : Fruit()
class Pomegranate : Fruit()

fun describe(fruit: Fruit) {
    when (fruit) {
        is Apple -> println("Apple is good for iron")
        is Mango -> println("Mango is delicious")
        is Pomegranate -> println("Pomegranate is good for vitamin D")
    }
}

fun main(args: Array<String>) {
    val obj = Demo.B()
    obj.display()
    val obj1 = Demo.A()
    obj1.display()

    describe(Apple())
    describe(Mango())
    describe(Pomegranate())
}