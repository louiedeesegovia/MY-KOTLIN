package com.example.myapplication
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    val now = LocalDateTime.now()

    var df = DateTimeFormatter
        .ofPattern("M/dd/yy h:mm a")

    val shortStyle = now.format(df)
    //shortStyle is "2/21/19 3:57 PM

    df = DateTimeFormatter
        .ofPattern("yyyy-MM-dd")
    val customStyle = df.format(now)
    //customStyle is 2019-02-21

    println("shortStyle is $shortStyle")
    println("customStyle is $customStyle")
}