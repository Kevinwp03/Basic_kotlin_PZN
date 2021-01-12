fun hello(firsname : String, lastName : String? = null){
    if (lastName == null){
        println("Hello $firsname")
    } else{
        println("Hello $firsname $lastName")
    }

}
fun main() {
    hello("Kevin", "Williams")
    hello("Kevin")
    hello("Budi", "Sanjoyo")
    hello("Budi" )
}