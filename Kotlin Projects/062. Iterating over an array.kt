package com.example.myapplication

fun main(){
    val numbers = arrayOf(2, 3, 5, 7, 11, 13, 17)
    var str = ""
    for(number in numbers){
        if(str.isNotEmpty()){
            str += "; "
        }
        str += number.toString()
    }
    //str is "2; 3; 5; 7; 11; 13; 17"

    println("str is $str")
}