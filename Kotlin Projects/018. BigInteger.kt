package com.example.myapplication

import java.math.BigInteger

fun main(){
    var a = BigInteger.valueOf(Long.MAX_VALUE)

    val b = BigInteger.valueOf(255)
    val c = BigInteger.valueOf(1000)

    a = a.times(c)
    //a is 9223372036854775807000
    println("s id $a")

    a = a.add(c).div(b)
    //a is 36170086419038336501
    println("a is $a")
}