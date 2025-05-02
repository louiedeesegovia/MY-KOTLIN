fun main() {
    val number = 34

    // Conversions
    val byteValue: Byte = number.toByte()
    val shortValue: Short = number.toShort()
    val intValue: Int = number.toInt()
    val longValue: Long = number.toLong()
    val floatValue: Float = 34.5F  // Using F
    val floatValue2: Float = number.toFloat()
    val doubleValue: Double = number.toDouble()
    val charValue: Char = number.toChar()

    // Display all values
    println("Byte value: $byteValue")
    println("Short value: $shortValue")
    println("Int value: $intValue")
    println("Long value: $longValue")
    println("Float value (from literal 34.5F): $floatValue")
    println("Float value (from number): $floatValue2")
    println("Double value: $doubleValue")
    println("Char value: $charValue")
}
