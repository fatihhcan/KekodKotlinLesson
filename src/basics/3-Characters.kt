package basics

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 9.05.2021                  │
//└────────────────────────────┘

fun main() {

    /**
     *      Tek tirnaklarin arasina, harf, sayi, escape char ya da unicode yazarak kullanilir.
     *      Cift tirnak icerisine yazilirsa String olur, Char olmaz.
     * **/

    val firstCharOfName: Char = 'G'
//    val firstCharOfName2 : Char = "G"
//    val firstCharOfName3: Char = 'Gö'
    val charNumber: Char = '6'
//    val charNumber2: Char = '53'

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Number deger alan bir Char degisken Int'e cevirilirken, gercek sayisal degerini almaz.
     *      Alacagi deger ASCII tablosundaki o sayisal degerin karsiligi olacaktir.
     * **/
    val contertedCharNumber = charNumber.toInt()
    println("charNumber = " + charNumber)
    println("charNumber = " + contertedCharNumber)

    val totalValue = charNumber.toInt() * contertedCharNumber
    println("totalValue = " + totalValue)

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Kacis(Escape) karakterlerini de tanimlamak icin kullanilabilir.
     * **/

    val escapeCharT: Char = '\t' // tab birakmak icin.
    val escapeCharN: Char = '\n' // alt satir icin.
    val escapeCharB: Char = '\b' // backspace icin
    val escapeCharR: Char = '\r' // satir basi
    val escapeChar1: Char = '\'' // ' ozel karakterini kullanmak icin.
    val escapeChar2: Char = '\"' // " ozel karakterini kullanmak icin
    val escapeCharSlash: Char = '\\' // \ ozel karakterini kullanmak icin
    val escapeCharDolar: Char = '\$' // $ ozel karakterini kullanmak icin

    val loremImpsum = "Lorem ImpsumT " + escapeCharT +
            "escapeCharN  " + escapeCharN +
            "Lorem ImpsumB " + escapeCharB +
            "Lorem ImpsumR " + escapeCharR +
            "Lorem ImpsumChar1 " + escapeChar1 +
            "Lorem ImpsumChar2 " + escapeChar2 +
            "Lorem ImpsumSlash " + escapeCharSlash +
            "Lorem ImpsumDolar " + escapeCharDolar +
            "Lorem ImpsumEnd"

    println(loremImpsum)

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Unicode karakterlerini de tanimlamak icin kullanilabilir.
     * **/
    val uniCode = '\uFF00'

    println("uniCode" + uniCode)
}