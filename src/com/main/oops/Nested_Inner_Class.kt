package com.main.oops

/*
-> Nested: A nested class is a class declared inside another class without the inner keyword.
By default, a nested class does not have access to the members (fields or methods)
of the outer class. This is similar to static nested classes in Java.

-> An inner class is a nested class marked with the inner keyword. Unlike nested classes,
inner classes maintain a reference to their outer class and can access its members.
 */
class Nested_Inner_Class {
    class Specs {
        fun showSpecs() {
            println("250 horsepower, 6 cylinders")
        }
    }
}

class OuterClass {
    private val msg = "Outer class property"

    inner class InnerClass { // without using 'inner' keyword, it will result in a compile-time error
        fun showMsg() {
            println(msg) // can access outer class property
        }
    }
}

fun main() {
    val specs = Nested_Inner_Class.Specs()
    specs.showSpecs()

    // accessing inner class,
    // we need an instance of the outer class to create an instance of the inner class
    val outer = OuterClass()
    val inner = outer.InnerClass()
    inner.showMsg()
}