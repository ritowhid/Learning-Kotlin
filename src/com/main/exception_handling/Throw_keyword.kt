package com.main.exception_handling
/*class hierarchy:
 *Throwable
 *Exception
 * all other exceptions that are predefined
 */

class IllegalVoterException(msg: String) : Exception(msg)
fun vote(name:String, age: Int) {
    if (age < 18) throw IllegalArgumentException("Younger than 18 can't vote.")
    println("$name voted")
}
fun main() {
    try {
        vote("Towhid", 15)
    }catch (e: Exception) {
        e.printStackTrace()
    }

    println("This is outside of exception")
}
