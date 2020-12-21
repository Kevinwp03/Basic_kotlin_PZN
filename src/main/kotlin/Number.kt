fun main(args: Array<String>) {
//Tipe data Number
    //Bilangan Bulat
    var age : Byte = 30
    var height : Int = 2000
    var distance : Short = 5000
    var balance : Long = 9999999999

    println(distance)

    //Bilangan desimal
    var value : Float = 98.85F  //syarat harus input F
    var radius : Double = 234134324.234234 // yang sering dipakai
    println(radius)

    //Literal
    var decimalliteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF //untuk image procesing
    var binary: Int = 0b0101010  // "0b" artinya binary
    println("Binary " + binary)

    //Underscore in number (sebagai separator supaya gampang dibaca)
    var price: Long = 9_999_999_999L
    println(price)

    //Conversion
    var number : Int = 10

    var byte    : Byte = number.toByte()
    var fload   : Float = number.toFloat()
    var long    : Long = number.toLong()
    var short   : Short = number.toShort()
    println("Number to fload = "+ fload)
    //hati" penggunaan conersion jangan sampai overflow,
    //contoh over flow
    var cost : Long = 9_000_000_000L;
    var costint : Int = cost.toInt()
    println("Overflow Long to Int ="+ costint)

}