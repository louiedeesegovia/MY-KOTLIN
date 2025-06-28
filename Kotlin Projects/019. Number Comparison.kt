package com.example.myapplication

import kotlin.math.abs

fun main(){
    val a = 1.0
    val b = (0.3 * 3) + 0.1

    //Wrong way to compare
    val isEqual1 = a == b
    //isEqual1 is false

    //Correct way to compare
    val delta = 1E-9
    val isEqual2 = abs(a - b) < delta
    //isEqual2 is true

    println("isEqual1 is $isEqual1")
    println("isEqual2 is $isEqual2")
}