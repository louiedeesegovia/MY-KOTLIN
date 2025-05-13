fun main(){
    val number = 42
    val s1 = number.toString()
    //s1 is "42"

    val s2 = "$number"
    //s2 id "42"

    val s3 = "" + number
    //s3 id "42"

    val s4 = "%03d". format(number)
    //s4 is "042"

    println("s1 is $s1")
    println("s2 is $s2")
    println("s3 is $s3")
    println("s4 is $s4")
}