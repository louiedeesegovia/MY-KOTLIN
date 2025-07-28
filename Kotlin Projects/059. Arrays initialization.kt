package com.example.myapplication

fun main(){

    //Empty array
    val n1 = IntArray(0)
    val n2 = intArrayOf()

    //Single-dimensional array
    val n3 = arrayOf(1, 2, 3)
    val n4 = intArrayOf(1, 2, 3)
    val n5: IntArray = intArrayOf(1, 2, 3)
    val s1 = arrayOf("1", "2", "3")

    //Multidimensional array
    val n6 = Array(2){Array(2){0} }
    val n7: Array<Array<Int>> = Array(2){Array(3){0} }
    n7 [1][2] = 7

    //Jagged array
    val n8 = Array(2){Array(2){0} }
    n8[1] = Array(3){0}
    n8[1][2] = 7

    n1.forEach { print("$it") }
    println()
    n2.forEach { print("$it") }
    println()
    n3.forEach { print("$it") }
    println()
    n4.forEach { print("$it") }
    println()
    n5.forEach { print("$it") }
    println()
    s1.forEach { print("$it") }
    println()
    n6.forEach { a: Array<Int> ->
        print("[")
        a.forEach { print("$it") }
        print("]")
    }
    println()
    n7.forEach { a: Array<Int> ->
        print("[")
        a.forEach { print("$it") }
        print("]")
    }
    println()
    n8.forEach { a: Array<Int> ->
        print("[")
        a.forEach { print("$it") }
        print("]")
    }
}