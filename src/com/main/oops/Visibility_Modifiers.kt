package com.main.oops

/*
  Modifier:
  - public: visible everywhere
  - private: visible inside the same class only
  - internal: visible inside the same module
  - protected: visible inside the same class and it's subclasses

 */
// public by default
class A {
    val int1 = 10
    fun display() {
        println("Value: $int1")
    }
}

// private: allow only the code declared inside the same scope, access.
//does not allow access to the modifier variable or function outside the scope.
class B {
    private val int2 = 15
    fun showPvt() {
        println("Inside A: $int2")
    }
}

// internal: Visible to any file within the same module (a group of files compiled together).
// Not accessible from outside the module.
// module example: moduleA/src/com/example/Helper.kt -> it is accessible anywhere inside moduleA.
internal class C {
    internal val number = 100
    internal fun display() {
        println("Number is: $number")
    }
}

/* protected: protected modifier strictly allows accessibility to the declaring class and its subclasses.
   The protected modifier cannot be declared at the top level
   Access Scope:
    - Accessible in the declaring class and its subclasses
    - Not visible outside the class hierarchy
*/
open class D {
    protected val int = 10
}

class E : D() {
    fun getValue() {
        println("The value of integer is: $int") // Accessible in subclass
    }
}


// overriding protected modifier
open class F {
    protected open val int = 10
}

class G : F() {
    override val int = 20
    fun printValue() {
        println("The value of integer is: $int")
    }
}

fun main() {

    // public
    val obj = A()
    obj.display()   // Accessible from anywhere

    // private
    val obj2 = B()
//    println(obj.int2)    // Error: Cannot access 'int': it is private in 'A'
    obj2.showPvt()

    val obj3 = C()
    obj3.display()

    // protected
    val obj4 = E()
    obj4.getValue()
//    println(obj4.int) // Error: Cannot access 'int': it is protected

    // override
    val obj5 = G()
    obj5.printValue()
}