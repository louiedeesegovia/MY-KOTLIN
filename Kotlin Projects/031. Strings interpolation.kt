package com.example.myapplication

fun main() {
    val fontSize = 14
    val fontFamily = "Arial"
    val style = "font-size: $fontSize;" +
            "font-family: \"$fontFamily\";"
    // style is "font-size: 14;font-family: "Arial";"

    println("style is '$style'")
}
