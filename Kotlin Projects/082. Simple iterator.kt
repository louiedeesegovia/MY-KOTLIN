package com.example.myapplication

fun main(){
    val list = listOf(1, 2, 3)
    val iterator = list.iterator()

    while(iterator.hasNext()){
        println(iterator.next())
    }
}