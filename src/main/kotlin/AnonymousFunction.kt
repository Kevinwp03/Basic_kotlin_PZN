fun main() {

    fun hello (name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val toUpper = {value: String -> value.toUpperCase()}
    println(hello("Kevin", toUpper))

    val lower = fun(value: String):String {
        if (value == ""){
            return "No name"
        }else{
            return value.toLowerCase()
        }
    }

    println(hello("Kevin", lower))
    println(hello("", lower))

    // Annonymous Function As Parameter
    println(hello("Williams", fun(value:String):String{
        return value.toUpperCase()
    }))
}