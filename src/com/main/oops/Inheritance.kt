package com.main.oops

/*
    -> By default, Kotlin classes and members are final, which means:
       You cannot inherit from a class unless it's marked open.
       You cannot override properties or methods unless they are open.

*/
// whenever you create an object of subclass, it calls the constructor of super class

open class Human(age: Int) { //primary constructor

    init {
        println("in human " + age)
    }

    open fun think() {
        println("Real thinking..")
    }
}

class Alien(age: Int) : Human(age) { // superclass constructor
    init {
        println("in Alien")
    }

    override fun think() {
        println("virtual thinking..")
    }
}

fun main(args: Array<String>) {
    var mayk = Alien(20)
//    mayk.think()
}
