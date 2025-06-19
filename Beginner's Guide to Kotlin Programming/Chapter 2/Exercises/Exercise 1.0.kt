package com.example.myapplication

fun main() {
    print("Enter number 01: ")
    val num1 = readLine()?.toIntOrNull()

    print("Enter number 02: ")
    val num2 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null) {
        println("Sum = ${num1 + num2}")
        println("Product = ${num1 * num2}")
        println("Difference = ${num1 - num2}")

        if (num2 != 0) {
            println("Quotient = ${num1 / num2}")
            println("Remainder = ${num1 % num2}")
        } else {
            println("Quotient = Undefined (division by zero)")
            println("Remainder = Undefined (division by zero)")
        }
    } else {
        println("Invalid input. Please enter valid integers.")
    }
}
