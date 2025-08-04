package com.example.myapplication

fun main(){
    val numbers = arrayOf(2, 3, 5, 7, 11, 13, 17, 19)
    var str = ""

    for(number in numbers){
        if(number > 10){
            break
        }
        if(str.isNotEmpty()){
            str += "-"
        }
        str += number
    }
    // str is "2-3-5-7"

    println("str is $str")
}