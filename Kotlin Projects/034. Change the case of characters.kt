package com.example.myapplication

fun main(){
    val str = "Lower and upper"

    val lower = str.lowercase()
    //lower is "lower and upper"

    val upper = str.uppercase()
    //upper is "LOWER AND UPPER"

    val capitalize = str.replaceFirstChar {
        it.uppercase()
    }

    println("lower is '$lower")
    println("upper is '$upper'")
    println("capitalize is '$capitalize'")
}