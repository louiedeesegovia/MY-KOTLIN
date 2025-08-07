package com.example.myapplication

fun main(){
    class Man{
        var name = ""

        init{
            name = "unknown"
        }
    }
    val man = Man()
    //man.name is "unknown

    println("name is '${man.name}'")
}