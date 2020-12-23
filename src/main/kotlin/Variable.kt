const val APPLICATION = "Learn Kotlin"
const val VERSION = "0.0.1"

fun main(){

    val firstName : String = "Kevin"
    val age = 17L

    println(firstName)
    println(age)

    // Kode Nullable
    var firstName1 : String? = null
    firstName1 = "Dian"
    println(firstName1)
    println(firstName1.length)

    // nilai dari variable constan
    println("$APPLICATION : $VERSION")

}