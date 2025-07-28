package com.example.myapplication

fun main() {
    val number = arrayOf(11, 2, 5, 7, 3)

    number.sort()
    //numbers is { 2, 3, 5, 7, 11 }

    number.forEach { println("$it") }
    println()

    //descending
    number.sortDescending()
    //numbers is { 11, 7, 5, 3, 2 }

    print("descending: ")
    number.forEach { (println("$it")) }

}
