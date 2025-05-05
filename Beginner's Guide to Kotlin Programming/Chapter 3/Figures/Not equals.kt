fun main() {
    print("Enter number 1: ")
    val num1 = readLine()?.toInt()

    print("Enter number 2: ")
    val num2 = readLine()?.toInt()

    if (num1 != num2) {
        println("Number 1 and Number 2 are not equal.")
    } else {
        println("Number 1 and Number 2 are equal.")
    }
}