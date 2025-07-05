package com.example.myapplication

fun main(){
    var dataString = "Substring removing!"

    //there is no "remove" method
    dataString = dataString.removeRange(9..17)
    //dataString is "Substring!"
    println("dataString is $dataString")

    dataString = dataString.removePrefix("Sub")
    //dataString is "string!"
    println("dataString is $dataString") 
}