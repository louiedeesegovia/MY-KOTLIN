package com.example.myapplication

fun main(){
    val n1 = arrayOf(1, 2, 3)
    val n2 = arrayOf(1, 2, 3)
    val n3 = arrayOf(3, 2, 1)

    val equal1 = n1 contentEquals n2
    //equal1 is true

    val equal2 = n1 contentEquals n3
    //equal2 is false

    println("equals is $equal1")
    println("equals is $equal2")
}