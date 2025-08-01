package com.example.myapplication

fun main(){
    // Enpty dictionary
    val d1 = mapOf<Int, String>()

    //init with some data
    val d2 = mapOf(
        1 to "one", 2 to "two"
    )

    println("d1 is $d1")
    println("d2 is $d2")
}