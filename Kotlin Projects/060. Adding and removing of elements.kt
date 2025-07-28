package com.example.myapplication

fun main() {
    val numbers = mutableListOf(2, 5, 7)
    numbers.add(11)
    // numbers is [2, 5, 7, 11]
    println("numbers is $numbers")

    numbers.add(1, 3)
    // numbers is [2, 3, 5, 7, 11]
    println("numbers is $numbers")

    numbers.removeAt(2)
    // numbers is [2, 3, 7, 11]
    println("numbers is $numbers")

    numbers.addAll(arrayOf(13, 17))
    // numbers is [2, 3, 7, 11, 13, 17]
    println("numbers is $numbers")

    numbers.removeAll(arrayOf(2, 3))
    numbers.addAll(0, listOf(2, 3, 5))
    // numbers is [2, 3, 5, 7, 11, 13, 17]
    println("numbers is $numbers")

    numbers.clear()
    // numbers is []
    println("numbers is $numbers")
}
