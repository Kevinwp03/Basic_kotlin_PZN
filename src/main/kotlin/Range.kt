fun main(){

    val range = 1..100 step 2
    //val range = 100 downTo 1

    println(range.count()) // banyak data
    println(range.contains(3)) // apakah data memiliki nilai data 2?
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

    //range dengan step
}