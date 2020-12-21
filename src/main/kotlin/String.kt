fun main(){
    var firstName: String = "Kevin"
    var lastName: String = "Williams"

    var address: String = """ 
        |Jalan pacuan kuda,RT 01 RW 02,
        |Menteng,
        |Jakarta pusat,
        |Indonesia
    """.trimMargin() // trim Margin berfungsi untuk menghilangkan space/tab pada string

//trimMargin bentuk 2
    var address2: String = """ 
        >
        >Jalan pacuan kuda,RT 01 RW 02,
        >Menteng,
        >Jakarta pusat,
        >Indonesia
    """.trimMargin(">") // di trim Margin kita dapat memilih karakter apapun

    // trimMargin bentuk 3
    var address3: String = """ 
        
            Jalan pacuan kuda,RT 01 RW 02,
            Menteng,
            Jakarta pusat,
            Indonesia
    """.trimIndent();

    var fullName: String = firstName + " " + lastName

    // String template $
    var fullName1: String = "$firstName $lastName"

    var desc: String = "$fullName1  Lenght = ${fullName1.length}"


    println(firstName)
    println(lastName)
    println(address )
    println(address2)
    println(address3)
    println(fullName)
    println(fullName1)
    println(desc)

}
