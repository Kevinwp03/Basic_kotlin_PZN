
fun String.hello(): String = "Hello $this" // Single expression

fun String.printHello(): Unit = println("Hai $this") // println adalah unitnya

fun main() {
    val firstName = "Kevin"
    val lastName = "Williams"

    println(firstName.hello())

    firstName.printHello()
    lastName.printHello()
    "Permana".printHello()


}