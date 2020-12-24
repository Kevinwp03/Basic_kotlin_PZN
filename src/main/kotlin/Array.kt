fun main(){
    val names  : Array<String> = arrayOf("Eko", "Joke", "Budi")

    names[0] = "Bambang"
    println(names[0])

    val nilai : Array<Int> = arrayOf(2, 4, 6, 8, 10)

    println(nilai[0])
    println(nilai[1])
    println(nilai[3])
    println(nilai.size)

    // contoh arraynya yang menggunakan null
    val gadget : Array<String?> = arrayOfNulls(5)
    gadget.set(0, "Handphone")
    gadget.set(1, null)
    gadget[2] = "Laptop"
    gadget[3] = null
    gadget[4] = "Speaker"
    println(gadget[0])
    println(gadget[1])
    println(gadget.size)

}