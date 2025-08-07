package com.example.myapplication

fun main(){
    class Man(var name: String = "unknown",
        var country: String = "unknown")

    val man1 = Man()
    //man1.name is "unknown"
    //man1.country is "unknown"

    val man2 = Man("Vladimir")
    //man1.name is "Vladimir"
    //man1.country is "unknown"

    val man3 = Man("Vladimir", "Brazil")
    //man1.name is "Vladimir"
    //man1.country is "Brazil"

    println("man1.name is '${man1.name}'")
    println("man1.country is '${man1.country}'")
    println("man2.name is '${man2.name}'")
    println("man2.country is '${man2.country}'")
    println("man3.name is '${man3.name}'")
    println("man3.country is '${man3.country}'")
}