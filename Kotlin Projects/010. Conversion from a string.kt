fun main(){
    val strNumber = "42"
    val number1 = strNumber.toInt()
    //number1 is 42

    val number2 = strNumber.toIntOrNull()
        if(number2 != null){
            println("number2 is $number2")
    }
    //number2 is 42

    val number3 = strNumber.toLong()
    //number3 is 42

    println("number1 is $number1")
    println("number3 is $number3")
}