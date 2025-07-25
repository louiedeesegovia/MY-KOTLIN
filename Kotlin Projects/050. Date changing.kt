package com.example.myapplication
import java.time.LocalDate
import java.util.Calendar
import java.time.LocalDateTime

fun main(){
    val now = LocalDateTime.now()
    val yesterday = now.minusDays(1)
    val tomorrow = now.plusDays(1)
    val nextMonth = now.plusMonths(1)
    val nextYear = now.plusYears(1)

    var cal = Calendar.getInstance()
    cal.add(Calendar.DAY_OF_YEAR, -1)
    val yesterday1 = cal.time

    cal = Calendar.getInstance()
    cal.add(Calendar.DATE, 1)
    val tomorrow1 = cal.time

    cal = Calendar.getInstance()
    cal.add(Calendar.MONTH, 1)
    val nextMonth1 = cal.time

    cal = Calendar.getInstance()
    cal.add(Calendar.YEAR, 1)
    val nextYear1 = cal.time

    println("yesterday is $yesterday")
    println("tomorrow is $tomorrow")
    println("nextMonth is $nextMonth")
    println("yesterday1 is $yesterday1")
    println("tomorrow1 is $tomorrow1")
    println("nextMonth1 is $nextMonth1")
    println("nextYear1 is $nextYear1")
}
