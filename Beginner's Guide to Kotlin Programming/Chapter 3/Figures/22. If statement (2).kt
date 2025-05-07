fun main(){
    println("Starting")

    print("Enter a number: ")
    val inputString = readLine()
    val number = inputString!!.toInt()

    if (number > 0){
        //Multiple lines grouped together for the if statement
        println("$number is positive")
        println("$number squared is ${number * number}")
    }
    println("Bye")
}