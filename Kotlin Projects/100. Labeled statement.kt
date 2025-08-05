package com.example.myapplication

fun main(){
    var firstMatchValue = -1
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(2, 3, 4)

    firstLoop@ for (value1 in array1){
        for (value2 in array2){
            if (value1 == value2) {
                firstMatchValue = value2
                break@firstLoop
            }
        }
    }
    //firstMatchValue is 2
    println(firstMatchValue)
}