package com.example.myapplication

fun main(){
    val charA = 'A'
    var intValue = charA.code
    //intValue is 66

    intValue++
    val charB = intValue.toChar()
    //charB is 'B'

    println("intValue is $intValue")
    println("charB is $charB")

}