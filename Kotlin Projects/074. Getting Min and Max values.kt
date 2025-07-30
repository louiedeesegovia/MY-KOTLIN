package com.example.myapplication

fun main(){
    val numbers = arrayOf(2, 3, 5, 7, 11)
    val min = numbers.minOrNull()
    // min is 2

    val max = numbers.maxOrNull()
    // mas is 11

    println("min is $min")
    println("min is $max")
}