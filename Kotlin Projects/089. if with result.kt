package com.example.myapplication

fun main(){
    val latitude = getLatitude()
    val location = if(latitude == 0){
        "Equator"
    }
    else if(latitude == 90){
        "north Pole"
    }
    else if(latitude == -90){
        "south Pole"
    }
    else{
        "not at the Equator or Pole"
    }

    println("location is $location")

    fun getLatitude(): Int{
        return (-90..90).random()
    }
}

