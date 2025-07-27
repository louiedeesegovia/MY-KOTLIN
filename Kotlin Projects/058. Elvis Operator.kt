package com.example.myapplication

fun main() {
    val n: Int? = 2
    val value = n ?: -1

    // Equivalent if-else version:
    val valueIfElse = if (n != null) {
        n
    } else {
        -1
    }

    println("Using Elvis operator: value = $value")
    println("Using if-else: valueIfElse = $valueIfElse")
}
