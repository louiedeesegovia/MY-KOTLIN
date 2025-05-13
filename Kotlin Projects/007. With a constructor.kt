class Gadget(var model: String)

class Person(var firstName: String, var lastName: String, var personalGadget: Gadget)

fun main() {
    val nokiaGadget = Gadget("Nokia 6610")

    val kim = Person("Lebron", "Kim", Gadget("iPhone X"))

    println("Nokia Gadget Model: ${nokiaGadget.model}")
    println("Kim's Gadget Model: ${kim.personalGadget.model}")
}
