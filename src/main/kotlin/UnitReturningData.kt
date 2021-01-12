fun printHello(name : String? = null){
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