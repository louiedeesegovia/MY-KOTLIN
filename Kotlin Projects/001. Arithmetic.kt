fun main() {
    print("Enter number 1: ")
    val num1 = readLine()?.toFloatOrNull()

    print("Enter number 2: ")
    val num2 = readLine()?.toFloatOrNull()

    if (num1 != null && num2 != null) {
        val int1 = num1.toInt()
        val int2 = num2.toInt()

        println("Sum: ${int1 + int2}")
        println("Subtract: ${int1 - int2}")
        println("Multiply: ${int1 * int2}")

        if (num2 != 0f) {
            println("Divide: ${num1 / num2}")
        } else {
            println("Cannot divide by zero!")
        }
    } else {
        println("Invalid input!")
    }
}


