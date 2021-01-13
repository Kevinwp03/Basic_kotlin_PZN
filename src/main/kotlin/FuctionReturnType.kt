
fun jumlah( a: Int, b : Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int,b : Int): Int {
    if (b == 0) {
        return 0
    } else {
        val result = a / b
        return result
    }
}

fun main() {
    println(jumlah(50, 50))
    println(jumlah(100, 100))

    val result1 = jumlah(10,10)
    println(result1)

    println(bagi(100,10))
    println(bagi(100,0))
    println(bagi(0,100))

}