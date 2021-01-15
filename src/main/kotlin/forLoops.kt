fun main() {
// Loops for Array
    val names = arrayOf("Kevin", "Williams", "Permana", "Irfan", "Tony","Wiji")
    println(names[0])

    var total = 0
    for (name in names){
        println(name)
        total++
    }


println("==========================================================================")
    val lenghtArray = names.size - 1
    for (k in 0..lenghtArray){
        println("Index $k = ${names.get(k)}")   // kombinasi dari range dan juga array
    }
    println("==========================================================================")

    println("total perulangan = $total")
    println("==========================================================================")
    //Loops for Range
    for (i in 0..100 step 2){
        print("$i," )
    }
    println("\n")
    print("==========================================================================\n")

    for (j in 100 downTo 0 step 5){
        print("$j, ")
    }
}