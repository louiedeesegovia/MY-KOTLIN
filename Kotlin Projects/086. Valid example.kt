package com.example.myapplication

fun main(){
    val latitude = getLatitude()
    val location: String

    if(latitude == 0)
        location = "Equator"
    else if(latitude == 90)
        location = "north Pole"
    else if(latitude == -90)
        location = "south Pole"
    else
        location = "not at the Equator or Pole"

    println("location is $location")

    fun getLatitude(): Int{
        return (-90..90).random()
    }
}

