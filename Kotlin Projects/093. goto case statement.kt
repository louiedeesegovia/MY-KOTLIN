package com.example.myapplication

fun main(){
    //There is no fallthrough expression in kotlin
    val sNumber = "1"
    var numberList = ""
    if (sNumber <= "1") numberList = "1"
    if (sNumber <= "2") numberList += "-2"
    if (sNumber <= "3") numberList += "-3"
    // numberList = "1-2-3"

    println("numberList is $numberList")
}