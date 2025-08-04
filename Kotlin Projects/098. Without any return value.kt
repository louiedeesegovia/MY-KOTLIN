package com.example.myapplication

fun main() {
    // Move function definitions first
    fun printMainData() {
        println("PrintMainData")
    }

    fun printOtherData() {
        println("PrintOtherData")
    }

    fun printSomeData(printAll: Boolean) {
        printMainData()
        if (!printAll) return
        printOtherData()
    }

    // Now call the function
    printSomeData(true)
}
