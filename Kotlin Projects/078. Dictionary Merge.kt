package com.example.myapplication

fun main(){
    val d1 = mapOf(1 to "one")
    val d2 = mapOf(2 to "two")
    val d3 = mapOf(3 to "three")

    val dAll = (d1 + d2).toMutableMap();
    //dAll is {1 = one, 2 = two}
    println("dAll is $dAll")

    dAll += d3;
    //dAll is {1 = one, 2 = two, 3 = three}
    println("dAll is $dAll")
}