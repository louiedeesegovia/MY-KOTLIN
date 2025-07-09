package com.example.myapplication

fun main(){
    var str = "1-3-2"

    val arStr = str.split("")
        .toTypedArray()
    arStr[3] = "2"
    arStr[5] = "3"
    str = arStr.joinToString("")
    //str is "1-2-3"

    println("str is $str")
}