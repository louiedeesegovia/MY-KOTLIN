package com.example.myapplication

fun main(){
    val a = 3
    val b = 5
    val c = 7

    if(c >= a && c >= b){
        println("nothing is larger than C.")
    }
    if(!(a >= b || a >= c)){
        println("A is the smallest")
    }
}