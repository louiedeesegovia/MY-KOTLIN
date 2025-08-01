package com.example.myapplication

fun main(){
    val disc = mapOf(
        1 to "A", 2 to "B"
    )

    val value1 = disc[3]
    //value1 is null

    val value2 = disc.getOrDefault(3, "-")
    //value2 is "-"

    println("value1 is $value1")
    println("value2 is $value2")
}