package com.example.myapplication

fun getNumber(): Int{
    return (-42..42).random()
}

fun main(){
    val n = getNumber()
    val classify = if(n > 0) "positive" else "negative"
    //classify is "negative"

    println("classify is $classify")
}

