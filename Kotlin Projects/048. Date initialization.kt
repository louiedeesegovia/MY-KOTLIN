package com.example.myapplication
import java.util.Calendar

fun main(){
    val cal = Calendar.getInstance()
    cal.set(1945, 5, 9, 0, 0, 0)
    val victoryDate = cal.time

    println("victoryDate is $victoryDate")
}
