fun main() {

    // Operasi && (dan)
    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiEkstra = 80

    val nilaiKelulusanUjian = nilaiUjian > 75
    val nilaiKelulusanAbsen = nilaiAbsen > 75
    val nilaiKelulusanEkstra = nilaiEkstra > 75

    val apakahLulus = nilaiKelulusanUjian && nilaiKelulusanAbsen && nilaiKelulusanEkstra
    // val apakahLulus = (nilaiKelulusanUjian && nilaiKelulusanAbsen) && nilaiEkstra = (true && true) && true
    // val apakahLulus = ((nilaiKelulusanUjian && nilaiKelulusanAbsen) && nilaiEkstra) = ((true) && true)

    println("Operasi && (dan) = " + apakahLulus)

    //Operasi || (atau)
    val boilWater = 100
    val boilOil   = 150

    val boilingWater = boilWater >= 100
    val boilingOil   = boilOil >= 200

    val isBoiling = boilingWater || boilingOil
    println("Operasi || (atau) = " + isBoiling)

    // operasi ! (kebalikan)
    val nilaiTrue = false
    println("Operasi ! (kebalikan) = " + !nilaiTrue)

}