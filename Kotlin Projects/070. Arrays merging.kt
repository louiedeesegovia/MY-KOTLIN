package com.example.myapplication

fun main(){
    val firstNumbers = arrayOf(2, 3, 5)
    val secondNumbers = arrayOf(7, 11, 13)
    val allNumbers = firstNumbers + secondNumbers
    //allNumbers is [2, 3, 5, 7, 11, 13]

    allNumbers.forEach{ print("$it ") }
}