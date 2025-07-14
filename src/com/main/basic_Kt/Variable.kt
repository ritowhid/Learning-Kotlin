package com.main.basic_Kt

fun main() {

    // Variable without an explicit data type (type inferred automatically)
    var myName = "Rakibul"
    myName = "Towhid"
//    print(myName) // var is changeable
    print("Hello, $myName")

    val name = "Islam"
//    name = "Rk" error: 'val' cannot change
    print(name)

    /* size: Double-64
             Long-64
             Float-32
             Int-32
             Short-16
             Byte-8
     */
    // Variable with explicit data type
    var a: String = "Rakibul"
    val age: Int = 22

//    var x    -> error:type cannot be inferred without initial value
    var x = 55; // valid: have to infer with value

    var y: Int  // valid declaration without initialization
    y = 100
}