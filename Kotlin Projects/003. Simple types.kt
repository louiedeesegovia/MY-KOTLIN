// "val" for constants and
// "var" for variables


fun main(){
    //Int
    var number = 42
    val maxInt64 = Long.MAX_VALUE
    val Mb = 1048576

    println(number)
    println(maxInt64)
    println(Mb)

    //Double
    val exp = 2.71828;
    var billion = 1E+9
    println(exp)
    println(billion)

    //Float
    val pi = 3.14f
    println(pi)

    //String
    val greeting = "Hello"
    println(greeting)

    //Multiple String
    var text = """this is some multiline text"""
    println(text)

    // Boolean
    val sunIsStar = true
    var earthIsStar = false
    println(sunIsStar)
    println(earthIsStar)

    //Character "A"
    val charA = 'A' //0xA9.toChar(.)
    println(charA)

    //Pair (Int, String)
    var one = Pair(.1, "one")
    println(one)
}
