package com.example.myapplication

fun main(){
    val numbers = arrayOf(1, 3, 2, 1, 3)

    val unique = numbers.distinct()
    //unique is {1, 3, 2}

    unique.forEach{ print("$it ")}

}