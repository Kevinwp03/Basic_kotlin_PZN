
infix fun String.to(type: String): String {
    return if (type == "UP") {
        this.toUpperCase()
    }else{
        this.toLowerCase()
    }
}

fun main() {
    val result = "Kevin williams" to "UP"
    val result1 = "Kevin Williams" to "Low"

    println(result)
    println(result1)

    1000 downTo 1 // fungsi infix juga
}