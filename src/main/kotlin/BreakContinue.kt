fun main() {
    // Break
    var i = 0

    while (true) {
        println("Perulangan ke $i")
        i++

        if (i > 1000){
            break
        }
    }

    //Continue

    for ( i in 0..100){
        if(i % 2 == 0){
            continue  // angka genap tidak di print
        }
    println("Angka $i")
    }

}