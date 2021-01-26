

fun main() {

    fun sayHello (name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }
    val lambdaUpper = {value : String -> value.toUpperCase()}

    println(sayHello("Kevin", lambdaUpper))
    println(sayHello("Kevin") { value: String -> value.toLowerCase() }) // lambda bisa langsung dimasukkan kedalam functionnya

    // Trailing Lambda
    val result1 = sayHello("Kevin", {value: String -> value.toLowerCase()})
    val result2 = sayHello("Kevin") {value: String ->
        value.toUpperCase()
    }

    println(result1)
    println(result2)
}