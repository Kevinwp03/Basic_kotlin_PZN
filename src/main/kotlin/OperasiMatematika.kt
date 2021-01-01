fun main(){
    val result1 = 10.0 / 5.0 // tipe datanya otomatis Double
    println(result1)

    val result2 = 10 + 10 / 5
    println(result2)

    // Augmented Assignments

    var total : Int = 0

    val total1 = 100
    total += total1

    val total2 = 200
    total += total2

    val total3 = 300
    total += total3

    val total4 = 400
    total -= total4

    println(total)

    // unary operation

    total ++ // total + 1
    total ++ // total + 1
    total -- // total + 1
    println(total)

    val suhu = -10
    println(suhu)

    val sehat = true
    println(!sehat)
}