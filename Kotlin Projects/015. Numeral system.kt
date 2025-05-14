fun main(){
    // decimal number system
    val decimal = 42

    // hexadecimal number system
    val hexadecimal = 0x42
    // hexadecimal is 66

    // binary number system
    val binary = 0b1010
    // binary is 10

    // 42 to decimal string
    val sDecimal = 42.toString()
    // sDecimal is "42"

    // 42 to octal string
    val sOctal = 42.toString(8)
    // sOctal is "52"

    // 42 to Hexadecimal string
    val sHexadecimal = 42.toString(16)
    // sHexadecimal is "2a"

    // 42 to binary string
    val sBinary = 42.toString(2)
    // sBinary is "101010"

    println("decimal is $decimal")
    println("hexadecimal is $hexadecimal")
    println("binary is $binary")
    println("sDecimal is $sDecimal")
    println("sOctal is $sOctal")
    println("sHexadecimal is $sHexadecimal")
    println("sBinary is $sBinary")
}