package com.example.myapplication

import java.util.Stack

fun main(){
    val intStack = Stack<Int>()
    intStack.push(1)
    intStack.push(3)
    intStack.push(5)

    val top = intStack.peek()
    //top is 5

    val first = intStack.pop()
    //first is 5

    val second = intStack.pop()
    //second is 3

    val third = intStack.pop()
    //third is 1

    println("top is $top")
    println("first is $first")
    println("second is $second")
    println("third is $third")
}