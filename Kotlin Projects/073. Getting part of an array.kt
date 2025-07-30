package com.example.myapplication

fun main(){
    val numbers = arrayOf(2, 3, 5, 7, 11)
    val first2 = numbers.copyOf(2)
    //first2 is [2, 3] ArraySlice<Int>

    val last3 = numbers.copyOfRange(2, 5)
    //last3 is [5, 7, 11] Array<Int>

    println("first2 is ${first2.contentToString()}")
    println("last3 is ${last3.contentToString()}")
}
