inline fun hello(firtsName: () -> String,
                 noinline lastName: () -> String,
                 ): String {
    return "Hello ${firtsName()}  ${lastName()}"
}

fun main() {
    for (i in 0..100){
    println(hello ({ "Kevin" }, {"Williams"}))
    }
}