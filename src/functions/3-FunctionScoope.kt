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
 *      Bir fonksiyon herhangi bir sinifin icerisinde degil de bir dosyasinin icersinde boslukta tanimlaniyorsa,
 *      top level function adini alir.
 *
 *      Bir fonksiyon olusturulurken top level tanimlama yapilamiyor, sadece bir sinifa ait fonksiyonlar yazilabiliyorsa,
 *      bunlara fonksiyon degil, method denir. Bir fonksiyona fonksiyon diyebilmeniz icin top level tanimlanabiliyor olmasi lazimdir.
 * **/
fun main() {

    calculateAtomPhysics()
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Fonksiyon icersinde fonksiyon tanimi kotlin'de yapilabir. Bu fonksiyonlara Local Functions denir.
 *      Sebebi ise, yazdiginiz fonksiyonun kendi sinifinizdan dahi cagrilmasini istemeyebilirsiniz.
 *      Bu fonksiyonunun herhangi bir baska fonksiyon ya da sinif icin degistirilmesini istemeyebilirsiniz.
 *      Reflection ile fonksiyonlariniz erisilirken gizli kalsin isteyebilirsiniz.
 *      Bu gibi durumlarda bu cok onemli fonksiyonunuzu baska bir fonksiyon icersine yazabilirsiniz.
 * **/

fun calculateAtomPhysics() {

    val userName = "Codemy"
    println("Initialize Process...")

//    val numberOne = readLine()!!.toInt()
//    val numberTwo = readLine()!!.toInt()
//    val result = numberOne + numberTwo
//    println("$result")
//
//    val numberThree = readLine()!!.toInt()
//    val numberFour = readLine()!!.toInt()
//    val result2 = numberOne + numberTwo
//    println("$result2")

    //    getValuesFromUserAndPrint()
    fun getValuesFromUserAndPrint() {
        userName.length
        val numberOne = readLine()!!.toInt()
        val numberTwo = readLine()!!.toInt()
        val result = numberOne + numberTwo
        println("$result")
    }

    getValuesFromUserAndPrint()

    println("Process has been done")
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Bir sinifin icersindeki fonksiyonlara, uye fonksiyonlar denir.
 * **/
class Car {
    fun setColor(colorCodeId: Int) {

    }
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Bir fonksiyon Generic tip aliyorsa, Generic Function olarak adlandirilir.
 * **/
fun <T> setColor(colorCodeId: T) {

}