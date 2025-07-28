package com.example.myapplication

fun main(){
    val numbers = arrayOf(2, 3, 5, 7, 11, 13, 17)
    val contain5 = numbers.contains(5)
    //contains is True

    val index5 = numbers.indexOf(5)
    //index5 is 2

    val contain10 = numbers.contains(10)
    //contain10 is False

    println("contain5 is $contain5")
    println("index5 is $index5")
    println("contain10 is $contain10")
}