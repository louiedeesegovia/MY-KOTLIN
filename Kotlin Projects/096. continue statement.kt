package com.example.myapplication

fun main(){
    val numbers = arrayOf(2, 3, 5, 7, 11, 13, 17, 19)
    var str = ""

    for(i in numbers.indices){
        if(i%2 == 1){
            continue
        }
        if(str.isNotEmpty()){
            str += "-"
        }
        str += numbers[i]
    }
    //str is "2-5-11-17"

    println("str is $str")
}