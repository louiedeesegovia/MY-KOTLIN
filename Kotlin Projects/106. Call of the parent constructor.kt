package com.example.myapplication

fun main() {
    abstract class Man {
        var name: String

        constructor(name: String) {
            this.name = name
        }
    }

    class Employee : Man {
        var position: String

        constructor(name: String, position: String) : super(name) {
            this.position = position
        }
    }

    val employee = Employee("Booker", "Max")

    println("name is '${employee.name}'")
    println("position is '${employee.position}'")
}
