package com.example.myapplication

fun getMonitorSize(): Int{
    return (15..27).random()
}

fun main(){
    val inchSize = getMonitorSize()
    val str: String
    when(inchSize){
        15 -> str = "too small"
        in 16..18 ->
            str = "good for the past decade"
        in 19..23->
            str = "for office work"
        in 24..27->
            str = "great choice"
        else-> str = ""
    }
    println("str is $str")
}