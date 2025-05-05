fun main() {
    print("Enter number 1: ")
    val num1 = readLine()?.toIntOrNull()

    print("Enter number 2: ")
    val num2 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null) {
        if (num1 > num2) {
            println("Number 1 ($num1) is greater than Number 2 ($num2).")
            println("Correct!")
        } else {
            println("Number 1 ($num1) is less than or equal to Number 2 ($num2).")
            println("Sorry try again!")
        }
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}