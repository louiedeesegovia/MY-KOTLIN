fun main(){
    var d1 = Long.MAX_VALUE
    // d1 is 9223372036854775807

    val d2 = d1.toInt()
    // d2 is -1

    d1 = 10
    val d3 = d1.toInt()
    //d3 is 10

    val d4 = Int.MAX_VALUE
    // d4 is 2147483647

    val d5 = d4.toLong()
    // d5 is 2147483647

    println("d1 is $d1")
    println("d2 is $d2")
    println("d3 is $d3")
    println("d4 is $d4")
    println("d5 is $d5")
}