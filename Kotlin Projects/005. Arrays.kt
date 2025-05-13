class Employee(var firstName: String, var lastName: String)

fun main() {
    // Array of integers
    val primeNumbers = arrayOf(2, 3, 5, 7)

    // Array of strings
    val gameList = arrayOf("soccer", "baseball", "basketball")
    println(gameList[0])

    // Array of Employee class
    val employees = arrayOf(
        Employee("Lebron", "Curry"),
        Employee("Harden", "Irving")
    )

    // Example: print employee names
    for (employee in employees) {
        println("${employee.firstName} ${employee.lastName}")
    }
}
