fun main() {
    var counter :Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }
    val anonymousIncrement = fun () {
        println("Anonymous Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter) // nilai counter akan berubah
}