package com.example.myapplication

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val numbers2 = numbers.map { it * 3 } // [3, 6, 9, 12, 15]

    numbers2.forEach { print("$it ") }
}
