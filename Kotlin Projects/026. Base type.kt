package com.example.myapplication

import java.math.BigInteger

fun main(){
    val arr = arrayOf<Number>(
        42.toByte(),
        512,
        1024.toShort(),
        77.toLong(),
        BigInteger("9876543219")
    )

    for(n in arr){
        println(n)
    }

}