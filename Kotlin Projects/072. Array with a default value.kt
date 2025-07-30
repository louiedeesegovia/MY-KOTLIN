package com.example.myapplication

fun main(){
    val value = 5
    val count = 3

    //first method
    val array1 = Array(count){value}
    // array is { 5, 5, 5 }

    //second method
    val array2 = IntArray(count){_ -> value}
    // array is { 5, 5, 5 }

    array1.forEach { print("$it") }
    println()
    array2.forEach { print("$it") }
}