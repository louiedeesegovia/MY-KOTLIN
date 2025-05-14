fun main() {
    val a = 5 // 0101
    val b = 6 // 0110

    // AND
    val c1 = a.and(b) // 0100 = 4

    // OR
    val c2 = a.or(b) // 0111 = 7

    // XOR
    val c3 = a.xor(b) // 0011 = 3

    // shift right
    val c4 = a.shr(1) // 0010 = 2

    // shift left
    val c5 = b.shl(1) // 1100 = 12

    // bits inversion
    val c6 = b.inv() // Kotlin returns -7 (bitwise NOT)

    println("c1 is $c1")
    println("c2 is $c2")
    println("c3 is $c3")
    println("c4 is $c4")
    println("c5 is $c5")
    println("c6 is $c6")
}
