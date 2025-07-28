package com.example.myapplication

fun main(){
    val numbers = arrayOf(2, 3, 5, 7, 11, 13, 17)
    var str = ""
    for((i,_) in numbers.withIndex()){
        if(str.isNotEmpty()){
            str += "; "
        }
        str += numbers[i].toString()
    }
    // str is "2; 3; 5; 7; 11; 13; 17"

    println("str is $str")
}