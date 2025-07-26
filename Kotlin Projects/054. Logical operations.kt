package com.example.myapplication

fun main(){
    val value1 = true
    val value2 = false

    val valueNot1 = !value1
    //valueNot1 is false

    val valueNot2 = !value2
    //valueNot2 is true

    val valueAnd = value1 && value2
    //valueAnd is false

    val valueOr = value1 || value2
    //valueOr is true

    val valueXor = value1.xor(value2)
    //valueXor is true

    println("valueNot1 is $valueNot1")
    println("valueNot2 is $valueNot2")
    println("valueAnd is $valueAnd")
    println("valueOr is $valueOr")
    println("valueXor is $valueXor")
}