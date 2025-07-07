package com.example.myapplication

fun main(){
    val str = "level"

    for(c in str){
        println(c)
    }

    //Iterating with index
    for((i, c) in str.withIndex()){
        println("str[$i] = $c")
    }
}