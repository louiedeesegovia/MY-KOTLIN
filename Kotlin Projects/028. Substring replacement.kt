package com.example.myapplication

fun main(){
    var startString = "3, 2, 1, go!"
    startString = startString
        .replace("1", "one")
        .replace("2", "two")
        .replace("3", "three")
    //startString = "three, two, one, go!"

    //replace all
    val oneString = "1 1 1"
        .replace("1", "one")
    //oneString is "one one one"

    println("startString is '$startString'")
    println("oneString is '$oneString'")
}
