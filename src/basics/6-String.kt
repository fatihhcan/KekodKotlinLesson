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
     *      Cift tirnak icerisine yazilan karakterler butunudur.
     *      Bir String ifadenin tum karakterlerini tek tek alip Char bir listeye atabilirsiniz.
     *      Ya da ekrana yazdirabilirsiniz.
     * **/
    val name = "KeKod"
    val char1 = 'K'
    val char2 = 'e'
    val char3 = 'K'
    val char4 = 'o'
    val char5 = 'd'
    val nameArray = charArrayOf(char1, char2, char3, char4, char5)

    for (char in name) {
        println(char)
    }

    val awesomeKeKod = "KeKod is Awesome"
    val firstCharOfAwesomeKeKod = awesomeKeKod[awesomeKeKod.indices.first]
    val lastCharOfAwesomeKeKod = awesomeKeKod[awesomeKeKod.indices.last]

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Farkli tipteki bir degiskenin onune String bir degisken ya da ifade koyarak toplarsaniz, sonuc String olacaktir.
     *      Ancak String bir degisken ya da ifadenin sonuna, + operatoru ile, farkli tipte bir degisken eklerseniz, kod calismaz.
     * **/
    val numbersValue: String = "value" + (4 + 2 + 8)
//    val numbersValue2: String = (4 + 2 + 8) + "value" // Calismaz. Comment'i kaldir kontrol et istersen keko

    println("numbersValue" + numbersValue)

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Herhangi bir degisken + operatorune ihtiyac duyulmadan direkt olarak "" arasina yazilarak kullanilabilir.
     *      Bunun icin sadece $ isaretine ihtiyaciniz vardir. Bu yapiya String template denir.
     *      Eger degiskenin bir ozelligine ihtiyac duyacaksaniz ${} seklinde kullanilir.
     * **/
    println("numbersValue $numbersValue")
    println("numbersValue ${numbersValue.length}")

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      3 tane cift tirnak kullanarak Raw String olusturulabilir.
     *      Raw String'ler ide'ye nasil yaziliyorsa oyle kullanilir. Hizalamada bozulma olmaz.
     *      trimIndent() fonksiyonu ile bu Raw String'in kenar bosluklarini silebilirsiniz.
     *      Bu silme islemini yaparken tum satirlardaki en soldaki karakteri baz alarak silme islemini saglar.
     *      Alttaki ornek icin 3 satirdan da $ isaretinin solundaki bosluga kadarini siler.
     *      Raw Stringlerin icinde escape karakterler calismaz.
     * **/
    val rawPineTree = """
                *
     $         ***
              *****
    """.trimIndent()

    /**
     *      trimMargin(marginPrefix) ise verilen karakter ne ise, string satirlarindaki o karaktere kadar olan kismi siler.
     *      Yukaridan farkli olarak bu karakter tek bir satirda ise, sadece o satirin, o karaktere kadar olan kismi silinir.
     *      trimMargin() ise karaktere bakmadan tum satirlarin en solundaki degeri baz alip,
     *      tum satirlardan o degerin solundaki bosluk kadar bosluk siler.
     * **/
    val rawPineTree2 = """
                *
     $         ***
              *****
    """.trimMargin("$")

    println(rawPineTree)
    println(rawPineTree2)
}