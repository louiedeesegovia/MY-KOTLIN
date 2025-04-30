fun main(){
    println(1 + 2 * 3 ) // my answer = 7 || correct answer = 7
    println(10%3) //my answer = 1 || correct answer = 1
    println(-1 % 3) //my answer = 2 || correct answer = -1

    println(8.8 / 4) //my answer = 2.2 || correct answer = 2.2
    println(10 / 3) // my answer = 3 || correct answer = 3

    println(11.toFloat()) //my answer = 11.00 || correct answer = 11.0
    println(10.10.toInt()) // my answer = 10 || correct answer = 10

    var a = 10
    a += 5
    println(a) //my answer = 15 || correct answer = 15
    a -= 3
    println(a) //my answer = 7 || correct answer = 12
    a++
    println(a) //my answer = 11 || correct answer = 13
    println(a++) //my answer = 12 || correct answer = 13
    println(a) //my answer = 12 || correct answer = 14
    println(--a) //my answer = 11 || correct answer = 13
    println(a) //my answer = 11 || correct answer = 13

    println(true && false) // my answer = false || correct answer = false
    println(true || false) //my answer = true || correct answer = true
    println(!!!!true) // my answer = true || correct answer = true

    println('A'.code) //my answer = 65 || correct answer = 65
    println('A' + 1) //my answer = 66 || correct answer = B
    println('C'.code) //my answer = 67 || correct answer = 67

    println("A + B") // my answer = A + B || correct answer A + B
    println("A" + "B") //my answer = AB || correct answer = AB
    println("A" + 1) //my answer = A1 || correct answer = A1
    println("A" + 1 + 2) //my answer = A3 || correct answer = A12
}