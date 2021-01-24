fun main(){


    tailrec fun display(value: Int){ // dengan tailrec, maka fungsi berubah menjadi loop biasa
        println("Recursive $value")
        if (value > 0){
            display(value - 1) // hanya bisa begitu tidak bisa ditambah embel" lagi
        }
    }

    println(display(10))

    tailrec fun factorialTail(value: Int, total: Int = 1):Int{
        return when (value) {
            1 -> total
            else -> factorialTail(value -1, total * value)
        }
    }

    println("FactorialTail = " + factorialTail(10))
}