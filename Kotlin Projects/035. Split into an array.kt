package com.example.myapplication

fun main(){
    val strData = "1981 | Kim Victorya | engineer"
    val arrData = strData.split(" | ")
    val year = arrData[0].toInt()
    //year is 1981

    val name = arrData[1]
    //name is "Kim Victorya"

    val position = arrData[2]
    //position is "engineer"

    println("year is $year")
    println("name is $name")
    println("position is $position")
}