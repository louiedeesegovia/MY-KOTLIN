package com.example.myapplication

fun main(){
    val chars = setOf('A', 'B', 'C', 'D')
    val containA = chars.contains('A')
    //containA is True

    val containE = chars.contains('E')
    //containE is False

    val chars2 = setOf('A', 'B')
    val containAll = chars2.containsAll(chars2)
    //containAll is True

    println("containA is $containA")
    println("containE is $containE")
    println("containAll is $containAll")
}