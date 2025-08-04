package com.example.myapplication

fun main(){
    val number = arrayOf(2, 3, 5, 7, 11, 13, 17)
    var sum = 0
    number.forEach {
        sum += it
    }
    println("sum is $sum")  // sum is 58

    var mult = 1
    listOf(2, 3, 4, 5).forEach { value ->
        mult *= value
    }
    println("mult is $mult")  // mult is 120
}
