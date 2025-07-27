package com.example.myapplication

fun main(){
    val n1: Int? = 42
    val exists1 = n1 != null
    //exists1 is True

    val n2: Int? = null
    val exists2 = n2 != null
    //exists2 is False

    println("exists1 is $exists1")
    println("exists2 is $exists2")
}