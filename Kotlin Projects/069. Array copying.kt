package com.example.myapplication

fun main(){
    val numbers1 = arrayOf(1, 2, 3, 4, 5)
    val numbers2 = numbers1.copyOf()

    numbers2.forEach { print("$it ") }
}