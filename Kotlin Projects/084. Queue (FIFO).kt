package com.example.myapplication
import java.util.LinkedList

fun main(){
    val intQueue = LinkedList<Int>()
    intQueue.add(1)
    intQueue.add(3)
    intQueue.add(5)

    val top = intQueue.peek()
    //top is 1

    val first = intQueue.poll()
    //first is 1

    val second = intQueue.poll()
    //second is 3

    val third = intQueue.poll()
    //third is 5

    println("topQueue is $top")
    println("firstQueue is $first")
    println("secondQueue is $second")
    println("thirdQueue is $third")
}