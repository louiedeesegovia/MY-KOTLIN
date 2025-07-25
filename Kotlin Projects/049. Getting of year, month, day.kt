package com.example.myapplication
import java.time.LocalDate
import java.time.LocalDateTime

fun main(){
    val now = LocalDate.now()
    val time = LocalDateTime.now()
    val year = now.year
    val month = now.month.value
    val day = now.dayOfMonth
    val hour = time.hour
    val minute = time.minute
    val second = time.second
    val dayOfWeek = now.dayOfWeek.value

    println("year is $year")
    println("month is $month")
    println("day is $day")
    println("hour is $hour")
    println("minute is $minute")
    println("second is $second")
    println("dayOfWeek is $dayOfWeek")
}