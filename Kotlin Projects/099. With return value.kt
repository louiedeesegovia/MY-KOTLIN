package com.example.myapplication

fun main() {
    fun containNumber(numbers: Array<Int>, number: Int): Boolean {
        for (currentNumber in numbers) {
            if (currentNumber == number) {
                return true
            }
        }
        return false
    }

    val numbers = arrayOf(1, 2, 3)
    val isContain2 = containNumber(numbers, 2)
    // isContain2 is true

    val isContain4 = containNumber(numbers, 4)
    // isContain4 is false

    println("isContain2 is $isContain2")
    println("isContain4 is $isContain4")
}