package com.example.myapplication

fun main(){
    val first = "A"
    val second = "B"
    val third = "A"

    val areEqual1 = first == second
    //areEqual is false

    val areNotEqual = first != second
    //areNotEqual is true

    val areEqual2 = first.compareTo(third) == 0
    //are Equal2 is true

    val moreThan = first.compareTo(second) > 0
    //moreThan is false

    println("areEqual1 is $areEqual1")
    println("areNotEqual is $areNotEqual")
    println("areEqual2 is $areEqual2")
    println("moreThan is $moreThan")
}