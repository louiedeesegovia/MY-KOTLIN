package com.example.myapplication

fun main(){
    val inchSize = getMonitorSize()
    val str = when(inchSize){
        15 -> "too small"
        in 16..18 ->
            "good for the past decade"
        in 19..23 ->
            "for office work"
        in 24..27->
            "great choice"
        else -> ""
    }
    println("str is $str")

    fun getMonitorSize(): Int{
        return (15..27).random()
    }
}