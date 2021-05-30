package functions

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 22.05.2021                 │
//└────────────────────────────┘

/**
 *      fun keyword'u ile fonksiyonlar baslar.
 *      fonksiyon ismi verilir.
 *      parametre parantezleri acilir ve parantezler girilir.
 *      : operatoru ve geri donus degeri yazilir.
 *      fonksiyon body'si acilir ve kapatilir.
 *      Geri donus degeri verilmeyen fonksiyonlar Unit tipini geri dondurur.
 * **/

//val name: String = "Gökhan"
//
//fun name : String = "Gökhan"
//
//fun name(val surName : String = "Gökhan") : String = "Gökhan"

//fun name(surName : String = "Gökhan") : String = "Gökhan"
fun main() {

    // Fonksiyon cagirilirken ismi ve parametreleri kullanilir.
    // Eger bir geri donusu varsa bir degiskene atabilir.
    takeSquare(2)
    val squareValue = takeSquare(2)

/* -------------------------------------------------------------------------------------------------------------------*/

    //  Bir class'in fonksiyonunu cagirirken ise nokta isaretini kullaniriz.
    Math.pow(2.0, 3.0)

/* -------------------------------------------------------------------------------------------------------------------*/

    // Default degeri olan parametrelere sahip bir fonksiyon cagirilirken, default degeri olan parametrelere deger atamak
    // sart degildir. Default degeri olan bu parametreler opsiyonel parametrelerdir.
    // Default degeri olan parametrelere deger atanmadan fonksiyon cagirilacaksa bu durumda parametre sirasi degisir.
    // Ide'ye hangi parametreye deger atadiginizi soylemek icin Named Arguments'leri kullanmaniz gerekir.
    reformatMessage("Message", true, 7, "tr")
    reformatMessage(message = "Message", size = 7, lang = "tr")
    reformatMessage("Message", true, 7)
    reformatMessage("Message", size = 7)

/* -------------------------------------------------------------------------------------------------------------------*/

    //vararg kullanimina orgnek. key = 3'den onceki parametreler vararg parametresine denk gelir.
    getUserInfo("Gökhan", "ÖZTÜRK", "Istanbul", "Turkiye", "", "", "", key = 3)

    // vararg parametresi olarak arrayOf kullanilmak istenirse * operatoru eklenmelidir. (spread operatoru)
    // bu operator diger dillerdeki pointer kullanimi anlamina gelmez. Kotlinde pointerlar yoktur.
    getUserInfo(*arrayOf("Gökhan", "ÖZTÜRK", "Istanbul", "Turkiye"), key = 4)

    getUserInfo2(3, "Gökhan", "ÖZTÜRK", "Istanbul", "Turkiye", "", "", "")

    getUserInfo3(3, "Gökhan", "ÖZTÜRK", "Istanbul", "Turkiye", true, 3.14, "")
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *    @param number degisken tanimlanir gibi tanimlanir.
 *    Fonksiyon parametresi tanimlanirken, val var gibi betimleyiciler kullanilmaz.
 * **/
fun takeSquare(number: Int): Int {
//    asdsads
//    asdsad
//    sad
//    asd
//    asd
//    asd
//    asd
//    asd
//    sa
    return 2 * number
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      = ile fonksiyonlara default deger verilebilir. (Default Argument)
 *      Default deger atamasi yapmak function overload islemi yapmanizi saglar.
 *      Tekrar tekrar ayni fonksiyonun farkli varyasyonlarini yazmak durumunda kalmayiz.
 * **/
fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {
    println("Message : " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang)
}

// Default arguments sayesinde asagidaki fonksiyonlari yazmak zorunda kalmayiz.
//fun reformatMessage(message: String, size: Int, lang: String = "tr") {
//
//}
//fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int) {
//
//}
//
//fun reformatMessage(message: String, size: Int) {
//
//}

/**
 *      Default degeri olan parametrelere sahip bir fonksiyon Java siniflarindan cagrilacaksa eger,
 *      Bu fonksiyona @JvmOverloads annotation'i verilmelidir. Boylece yazilan kod Jvm'e hazir hale getirilirken,
 *      ilgili fonksiyonun tum varyasyonlari yazilir (overload edilir)
 * **/
@JvmOverloads
fun print(message: String = "Message") {
    println(message)
}

/**
 *      Extend edilebilir bir sinif, yavru (child) sinif tarafindan miras (inherit) alinirsa
 *      ve bu sinifin override edilebilir open bir methodu varsa, bu method default argument'e sahip olursa,
 *      bu sinifi miras alan sinifda method override edilirse, override edilen methodun parametresine default argument tanimlanamaz.
 *      Ust sinifin method'undaki default argument gecerli olur.
 * **/
open class A {
    open fun foo(i: Int = 10) { /*...*/
    }
}

class B : A() {
    override fun foo(i: Int) { /*...*/
    }  // no default value allowed
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Cok uzun sayida parametreniz olacaksa "variable number of arguments" - vararg tanimlanabilir.
 *      Bu sayede fonksiyon tek bir parametre aliyor gibi gozukurken kendisine cok miktarda degisken atanabilir.
 *      Bu degiskenlere array'e erisir gibi erisebilirsiniz. [index] ya da .get(index) seklinde
 *
 *      vararg tek ya da son parametre olarak yazilirsa, Jvm'e hazirlanirken, Java'daki "String..." gibi ayni kod derlenir.
 *      Ancak vararg param birden fazla tanimlanirken ortada ya da basta yer alirsa, Jvm'e hazirlanirken, Array'e donusturulur.
 *      Bu da performans farki olusturur demektir.
 * **/
fun getUserInfo(vararg userInfo: String, key: Int) {
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo2(vararg userInfo: String) {
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo2(key: Int, vararg userInfo: String) {
    userInfo[3]
    userInfo.get(3)
    println(key)
}

fun getUserInfo3(vararg userInfo: Any) {
    userInfo[3]
    userInfo.get(3)
}

/**
 *      Ayni fonksiyon icersinde birden fazla vararg tanimi yapilmasina izin verilmez.
 *      Calismaz. Comment'i kaldir kontrol et istersen keko
 * **/
//fun getUserInfo(vararg userInfo: String, vararg userInfo2: String) {
//    userInfo[3]
//}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Bir fonksiyona = koyularak da return edecegi deger yazilabilir. (Single-Expression kullanimi)
 * **/
val userList = arrayOfNulls<String>(5)

fun getListCount(): Int = userList.size

fun getListCount2(): Int {
    return userList.size
}