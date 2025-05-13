enum class PreciousMetal {
    Platinum, Gold, Silver
}

enum class Planet(val value: Byte) {
    Mercury(1), Venus(2), Earth(3)
}

fun main() {
    val Au = PreciousMetal.Gold
    val earth = Planet.Earth
    val mercury = Planet.Mercury
    val Ag = PreciousMetal.Silver
    val Pt = PreciousMetal.Platinum

    println(Au)            // Output: Gold
    println(earth.value)     // Output: 3

    println("Planet: $mercury")
    println("Value: ${mercury.value}")
    println("Precious Metal: $Ag")
    println("Precious Metal: $Pt")
}
