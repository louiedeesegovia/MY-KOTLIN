class Phone {
    var model = ""
}

class Player {
    var firstName = ""
    var lastName = ""
    lateinit var personalPhone: Phone
}

fun main() {
    val nokiaPhone = Phone()
    nokiaPhone.model = "Nokia 6610"

    val kim = Player()
    kim.firstName = "Louie"
    kim.lastName = "Kim"
    kim.personalPhone = nokiaPhone

    println(kim.personalPhone.model)  // Output: Nokia 6610
}
