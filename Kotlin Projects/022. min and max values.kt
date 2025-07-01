package com.example.myapplication

fun main(){

    val minValue = 2
        .coerceAtMost(1)
        .coerceAtMost(3);
    //minValue is 1

    val maxValue = 2
        .coerceAtLeast(1)
        .coerceAtLeast(3);
    //maxValue is 3

    println("minValue is $minValue")
    println("maxValue is $maxValue")
}