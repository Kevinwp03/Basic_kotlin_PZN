fun printHello(name : String? = null) : Unit {  // secara default Unit sudah ada,
    if (name == null) {
        println("Hello Broku")
    }else {
        println("Hello $name")
    }
}

fun main() {
    printHello()
    printHello("Kevin")
}