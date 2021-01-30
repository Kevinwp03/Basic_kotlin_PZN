//Break to Label

fun labelBreak(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j > 5){
                break@loopI
            }
            println(" $i x $j = ${i * j} ")
        }
    }
}

//Continue to Label
fun labelContinue() {
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j == 5){
                continue@loopI // continue : perintah akan dilewati,
            }
            println(" $i x $j = ${i * j} ")
        }
    }
}

// Retrun to Label
fun main() {
    fun test(name: String, operation: (String)-> Unit):Unit = operation(name) //extention Function

    test("") test@{
        if (it == ""){
            return@test // tanpa di isi @test, maka retur tidak bisa diisi
        }else {
            println("KEVIN")
        }
    }
}