package com.main.oops

// default getter and setter
class Person {
    var name: String = "defaultValue"
        get() = field
        set(value) {
            field = value
        }
}

// set the value by using a method inside a class.
class Company {
    var nam: String = "abc"
        private set

    fun updateName(newName: String) {
        nam = newName
    }
}

// custom Setter and Getter
class User {
    var email: String = ""
        get() = field.lowercase()
        set(value) {
            field = value.trim()
        }
    var password: String = ""
        set(value) {
            if (value.length >= 6) field = value
            else println("Password too short")
        }
    var age: Int = 0
        set(value) {
            field = if (value > 0) value else 0
        }
    var gender: Char = ' '
}

fun main() {
    val person = Person()
    person.name = "Tom" // set name
    println(person.name) // get name

    //============================
    val com = Company()
    com.updateName("GeeksforGeeks")

    //============================
    val user = User()
    user.email = "  PRAVEENRUHIL1993@GMAIL.COM "
    user.password = "Geeks@123"
    user.age = 25
    user.gender = 'M'

    println(user.email)
    println(user.password)
    println(user.age)
    println(user.gender)
}