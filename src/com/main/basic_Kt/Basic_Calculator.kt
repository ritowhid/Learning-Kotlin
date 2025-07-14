package com.main.basic_Kt

fun main() {
    println("Welcome to the Kotlin Calculator! Type 'x' to exit.\n")

    while (true) {
        print("Enter an operator (+, -, *, /, %) or 'x' to exit: ")
        val op = readLine()?.trim()?.getOrNull(0) ?: continue

        if (op == 'x' || op == 'X') {
            println("Calculator exited. Have a great day!")
            break
        }

        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            print("Enter two numbers separated by space: ")
            val input = readLine()?.trim()?.split(" ")

            val num1 = input?.getOrNull(0)?.toIntOrNull()
            val num2 = input?.getOrNull(1)?.toIntOrNull()

            if (num1 == null || num2 == null) {
                println("Invalid number format. Please enter valid integers.\n")
                continue
            }

            var result = 0
            if (op == '+') {
                result = num1 + num2
            } else if (op == '-') {
                result = num1 - num2
            } else if (op == '*') {
                result = num1 * num2
            } else if (op == '/') {
                if (num2 == 0) {
                    println("Cannot divide by zero!\n")
                    continue
                } else {
                    result = num1 / num2
                }
            } else if (op == '%') {
                result = num1 % num2
            } else {
                println("Invalid operator!\n")
                continue
            }

            println("Result: $num1 $op $num2 = $result\n")

        } else {
            println("Invalid operator. Use +, -, *, /, %, or 'x' to exit.\n")
        }
    }
}