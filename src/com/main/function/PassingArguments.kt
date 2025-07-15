package com.main.function

fun main(args: Array<String>) {

    // call the function by passing all arguments:

    val name = "Rakibul"
    val rollno = 25
    val grade = 'A'
    student(name, grade, rollno)
    student("Islam", 'B', 30)
}

fun student(name: String, grade: Char, roll_no: Int) {
    println("Name of the student is: $name")
    println("Grade of the student is: $grade")
    println("Roll no of the student is: $roll_no")

}