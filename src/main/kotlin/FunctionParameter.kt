fun sayHello(firtsName : String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firtsName")
    } else {
        println("Hello $firtsName $lastName")
    }
}
                                                            // Membuat fungtion menjadi lebih dinamic
fun main() {
    sayHello("kevin", "Williams")
    sayHello("Budi", null)
    sayHello("Bambang", "Pamungkas")
}