package com.example.myapplication

fun main(){
    //to int
    val strNumber = "42"
    //the first method
    val number1 = strNumber.toInt()
    //the second method
    val number2 = strNumber.toIntOrNull()

    if(number2 != null){
        println("number2 is $number2")
    }

    //to Double and Float
    //the first method
    val strPi = "3.14"
    val pi = strPi.toFloat()

    //the second method
    val strExp = "2.71828"
    val exp = strExp.toFloatOrNull()

    //the third method
    val strHalf = "0,5"
    val half = strHalf.replace(",",".").toDouble()

    println("number 1 is $number1")
    println("pi is $pi")
    println("exp is $exp")
    println("half is $half")
}