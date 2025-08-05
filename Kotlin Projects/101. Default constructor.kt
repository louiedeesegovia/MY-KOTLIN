package com.example.myapplication

fun main() {
    class Man {
        var name = ""
    }

    val man = Man()
    man.name = "John"  // Optional: set the name
    println("The man's name is ${man.name}")
}
