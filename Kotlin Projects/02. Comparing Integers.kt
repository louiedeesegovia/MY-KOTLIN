fun main(){
    print("Enter number 1: ")
    val num1 = readLine()?.toIntOrNull()

    print("Enter number 2: ")
    val num2 = readLine()?.toIntOrNull()
if(num1 != null && num2 != null){
    if(num1 < num2){
        print("$num2 is GREATER THAN $num1.")
    }
    else if(num2 < num1){
        print("$num1 is GREATER THAN $num2")
    }
    else{
        print("$num1 and $num2 are equal.")
        }
    }
else{
    print("Invalid input. Please input integer numbers only.")
    }
}