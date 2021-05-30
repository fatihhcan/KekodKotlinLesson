package functions

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 22.05.2021                 │
//└────────────────────────────┘

fun main() {

    /**
     *      Bu dunyayi cekilebilir seylerin basinda gelir Extension Functions :)
     *
     *      Uzerinde degisiklik yapamadigimiz (readOnly) siniflara, ya da yapmak istemedigimiz siniflara, bu siniflarin
     *      icerisinde yazmadan fonksiyon tanimlayabilmemizi saglar. Boylece o sinifa uye bir fonksiyon kazandirabiliriz.
     *      Bunu yaparken unutmamaniz gereken; yazdiginiz extension fonksiyon aslinda o sinifin gercek bir fonksiyonu olmayacaktir.
     *
     *      Sad but true story. Olsundu. Extension fonksiyonlar kalbinize girecekler. Bir sinifa ait olmalari gerekmez :)
     *
     *      Reciver diye adlandiracagimiz bir sinifa ihtiyac duyar. Extension yazacagimiz sinifi ifader eder Reciever tanimi.
     *
     *      Yapisal olarak;
     *
     *      fun String.extPrint(handsomeValue : HandsomeOne) : Unit {
     *
     *      }
     * **/

    // normalde degiskenlere deger atayip, print islemini asagidakiler gibi yapariz.
    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 1341
    println(schoolNumber)

    val tcIdentityNumber: Long = 18608268888
    println(tcIdentityNumber)

    // yukaridaki kullanimlarin yerine normal bir log2 fonksiyonu yazilabilir ve asagidaki gibi kullanilabilir.
    log2(pi)
    log2(schoolNumber)
    log2(tcIdentityNumber)

/* -------------------------------------------------------------------------------------------------------------------*/

    // extension fonksiyonlar ister direkt value'lar uzerinden cagrilabilir.
    (3 + 0.14).log("")
    1341.log("")
    1341.toFloat()
    18608268888.log("")

    (3 + 0.14) log ""

    // isterseniz de degiskenler uzerinden.
    pi.log("")
    schoolNumber.log("")
    tcIdentityNumber.log("")

//    1341.extToString()

/* -------------------------------------------------------------------------------------------------------------------*/

    // extension fonksiyonlar sari renkte gozukurler.
    val result: Int = "3".extPlus("5")
    val result2: Int = "3" extPlus "5"

    // infix fonksiyonlar extension fonksiyonlarla kullanilabilir demistik.
    // extPlus infix extension oldugu icin . (nokta) kullanimina ihtiyac duymaz.
    // log ise sadece extension fonksiyon oldugu icin . (nokta) ile cagirilir.
    ("3" extPlus "5").log("")

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Extension fonksiyonlar bir sinifin icerisinde yazildilar ise kullanim alani sadece o sinifin icerisi olacaktir.
     *      Sinifin disindan, Global cagirim yapilamaz.
     *      Int.extToString() methodu Shape sinifi icinde yazilmistir. Dolayisiyla Shape sinifi disindan erisilemez.
     * **/
//    4.extToString() // Calismaz. Comment'i kaldir kontrol et istersen keko

    // yine de extension methodu veren asagidaki main gibi bir method ile erisilebilir.
    val shape = Shape()
    shape.setNumber(45)
    shape.main()
}

/* -------------------------------------------------------------------------------------------------------------------*/

// normal fonksiyon
fun log2(number: Number) {
    println(number)
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Number (reciever) sinifina extension olarak yazilmis log fonksiyonu. Ayni zamanda infix yapilmistir.
 *      this ifadesi, extension yapilan degeri verir. 3 log "4" yaparsaniz,
 *      asagidaki kod size emptyParam = "4", this = 3 olarak verilir.
 * **/
infix fun Number.log(emptyParam: String) {
    println(emptyParam + this)
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Infix extension fonksiyon expression formunda kullanilabilir.
 * **/
infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()

/* -------------------------------------------------------------------------------------------------------------------*/

open class Shape {

    var intNumber = 0

    fun setNumber(intNumber: Int) {
        this.intNumber = intNumber
    }

    fun main() {
        intNumber.extToString()
        intNumber.log("")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Bir sinifin icinde, farkli bir sinifa ait extension fonksiyon yazilirsa, bu sinifin icinde ayni isimde normal
     *      bir fonksiyon olsa bile, extension fonksiyonun icerisinde, ayni isme sahip fonksiyon cagrilirsa, bu extension
     *      fonksiyona isaret eder demektir. Sinifin ayni isimdeki uye fonksiyonunu extension fonksiyon icersinde cagirmak icin
     *      this@sinifismi.uyefonksiyon() seklinde cagirim yapilmalidir.
     * **/
    open fun Int.extToString() {
        println("")

        // Int.extToString() methodunu isaret eder.
        extToString()

        // Shape'e ait asagidaki uye methodu isaret eder.
        this@Shape.extToString()

        println("Awesome class printi")
    }

    fun extToString() {
        println("Keko class printi")
    }
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Bir sinifin, yazilmis extension fonksiyonun aynisini (isim ayni, parametre sayisi ve tipleri ayni, ayrica geri donus tipi de ayni olmali),
 *      kendi icinde barindiriyorsa, bu durumda yazilan extension fonksiyon gecersizdir. Sinifin uye fonksiyonu cagirilir.
 * **/
fun Shape.setNumber(intNumber: Int) {
    val result = intNumber * intNumber
    println(result)
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Bir sinifa extension fonksiyon yazilabildigi gibi extension property de yazilabilir.
 *      Bunun sebebi aslinda property'lerin get() ve set() methodlarindan olusmasindan dolayidir.
 *      Bu extension property'lerin icerisinde field tanimlanamaz.
 *      Dolayisiyla aslinda gercek anlamda bir degisken extension yapilamaz.
 *      Bu konu property vs field konusu ile beraber sinif'lar islenirken detayli anlatilacaktir.
 * **/
var Shape.type
    get() = "Rectangle"
    set(value) {
        type = value
    }

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Open (Extend edilebilir) bir sinifa, sinifin icinde bir open (override edilebilir) extension fonksiyon yazilirsa,
 *      bu sinifi miras (inherit) alan siniflar, ilgili extension fonksiyonu override edebilirler.
 * **/
class Rectangle : Shape() {
    override fun Int.extToString() {
    }
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      NOTES :
 *      Nullable extension function da yazilabilir.
 *      Companion object'lere de extension yazilabilir. Siniflar'da ornegini yapacagiz.
 * **/