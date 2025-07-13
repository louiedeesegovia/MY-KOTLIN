package com.example.myapplication

fun main(){
    val str = "ABC"
    val charA = str[0]
    //charA is 'A'

    val charB = str[1]
    //charB is 'B'

    val charC = str[2]
    //charC is 'C'

    var charList = ""
    for (c in str){
        charList += "$c;"
    }
    //charList is "A;B;C;"

    println("charA is $charA")
    println("charB is $charB")
    println("charC is $charC")
    println("charList is $charList")
}