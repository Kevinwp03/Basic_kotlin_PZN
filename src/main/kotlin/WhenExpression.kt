fun main() {
    var nilai = "C"

    when (nilai) {

        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Amazing")
        }
        "C" -> {
            println("Amazing")
        }
        "D" -> {
            println("Amazing")
        }
        "E" -> {
            println("Try again Next year")
        }
        else -> println("Ups..something wrong")
    }

    //Multiple Option
    when (nilai) {
        // if (nilai == "A" || nilai == "B" || nilai == "C")
        "A", "B", "C" -> {
            println("Selamat anda lulus")
        }
        else -> {
            println("Maaf, Anda tidak Lulus")
        }
    }

    // When expression In  dan tidak In
    nilai = "E"
    val nilaiLulus : Array<String> = arrayOf("A", "B", "C")
    when(nilai){
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("Maaf. Tidak Lulus")
    }

    // When expression is
    val name = "Kevin"
    when (name) {                                                   // akan sering digunakan pada saat belajar Objec oriented programming
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    // When sebagai pengganti If Else

    val nilaiUjian = 90
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Coba Lagi Tahun Depan")
    }

}