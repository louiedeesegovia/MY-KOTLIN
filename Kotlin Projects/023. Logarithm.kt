package com.example.myapplication

import kotlin.math.ln

fun main(){
    val number = 512.0
    val logBase = 8.0
    val result = ln(number)/ln(logBase)
    //result is 3.0

    println("result is $result")
}