package com.example.myapplication

fun main(){
    val s1 = "three"
    val s2 = "two"
    var s3 = "$s1, $s2"
    s3 += ", one"

    val sGo = "$s3, go!"
    //sGo is "three, two, one, go!"

    println("sGo is '$sGo")
}