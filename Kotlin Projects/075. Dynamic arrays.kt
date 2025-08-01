package com.example.myapplication

fun main(){
    val count = 15
    val arInt = Array(count, {0})
    arInt[0] = 1

    arInt.forEach { print("$it ") }
}