fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val contohLambda:(String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName" // otomatis menjadi return value
        result  //ini adalah return valuenya
    }
    // memanggil
    val result = contohLambda ("Kevin", "Williams")
    println(result)

    // Lambda : It
    val sayHello:(String) -> String ={
        "Hello $it" // it = aggapnya hasil dari representasi yang pertama
    }
    println(sayHello("Kevin")) // hanya bisa untuk 1 parameter saja

    // Lambda : Method Preference
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Kevin Williams Permana"))
}