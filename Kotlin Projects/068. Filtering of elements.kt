package com.example.myapplication

fun main(){
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val oddItems = numbers.filter { i -> i % 2 == 1 }
    //oddItems is { 1, 3, 5 }

    oddItems.forEach{print("$it ")}
}