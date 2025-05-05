fun main() {
    print("Enter number1: ")
    val num1 = readLine()?.toIntOrNull()

    print("Enter number2: ")
    val num2 = readLine()?.toIntOrNull()

    print("Enter number3: ")
    val num3 = readLine()?.toIntOrNull()

    print("Enter number4: ")
    val num4 = readLine()?.toIntOrNull()

    if(num1 != null && num2 != null && num3 != null && num4 != null){
        val result = (num1 < num2) && (num3 > num4)
        print("Result: $result")
    }
    else{
        print("Invalid input! Try again")
    }
}
