package com.example.myapplication

fun main(){
    val first = setOf(1, 2)
    val second = setOf(1, 2)
    val third = setOf(1, 2, 3)

    val isEqual = first == second
    //isEqual is true

    val isIntersects = first.intersect(third).any()
    // isIntersects is true

    val isSubset = first.containsAll(third)
    // isSubset is false

    println("isEqual is $isEqual")
    println("isIntersects is $isIntersects")
    println("isSubset is $isSubset")
}