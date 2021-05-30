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
     *      Dizi tanimlamalari icin kullanilirlar.
     *      arrayOf(ayni tip degerler) seklinde tanimlanabilir.
     *      arrayOf<Any>(farkli tip degerler) seklinde tanimlanabilir.
     *      arrayOfNulls<Type>(size) seklinde ise verilen boyut kadar null deger iceren dizi tanimlanabilir.
     * **/
//                       index =  0  1   2   3   4   5
    val studentNumbers = arrayOf(13, 45, 53, 54, 25, 10)
    val studentNames = arrayOf("Ahmet", "Ayşe", "Veli", "Derya")
    val firstCharOfNames = arrayOf('A', 'A', 'V', 'D')
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'V', true)
    val arrayOfNulls = arrayOfNulls<String>(4)

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Array<Type>(size){higher order function} seklinde de tanimlanabilir.
     *      Bu durumda higher order function icerisinde son satira denk gelen degerler diziyi olusturur.
     *      Higher order function, icerisi dizinin boyutu kadar index'i(it) bir arttirarak calisir.
     * **/

    // 5 elamanli, tum elemanlari 3.14 olan bir dizi olusturur.
    val carNamesMini = Array<Double>(5) {
//        pseudo Codes
//        pseudo Codes
//        pseudo Codes
        3.14 * it
    }

    // 10 elemanli, 0-9 arasindaki index degerlerinin karesini alan bir dizi olusturur.
    // {0,1,2,4,9,16,25,36,49,81}
    val carNames = Array<Unit>(10) {
        println((it * it).toString())
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      ByteArray, ShortArray, IntArray, LongArray, DoubleArray, FloatArray gibi ya da bunların Unsigned halleri
     *      primitive array tanimlamalari da yapilabilir.
     *      Bu tarz tanimlamalarda ilgili index degerine atama icin set(index, value) ya da [index] = value kullanilabilir.
     *      Bu tarz tanimlamalarda ilgili index degerindeki degisken degerine get(index) ya da [index] seklinde ulasilabilir.
     * **/
    val firstCharOfCountries = CharArray(4)
    firstCharOfCountries[0] = 'T'
    firstCharOfCountries.set(1, 'İ')
    firstCharOfCountries.set(3, 'A')

    firstCharOfCountries[2] = 'B'

    println("firstCharOfCountrys index 2 :" + firstCharOfCountries.get(2))
    println("firstCharOfCountrys index 2 :" + firstCharOfCountries[2])

/* -------------------------------------------------------------------------------------------------------------------*/
    /**
     *      val ile tanimlanmis bir array'in herhangi bir index'indeki deger degistirilebilir.
     *      val indexdeki degerlerin degismesine karismaz.
     *      Ancak ilgili diziyi baska bir dizi ile esitlemenize izin verilmez.
     *      Bunun icin tanimlamayi var ile degistirmeniz gerekir.
     * **/

    val awesomeArray = arrayOfNulls<String>(5)
    awesomeArray[2] = "Gökhan"
//    awesomeArray = arrayOf("foo", "boo", "goo", "doo", "loo") // Calismaz. Comment'i kaldir kontrol et istersen keko

    /**
     *      Array'in size'i disina cikiyorsaniz (boyutu disina) cikiyorsaniz, IndexOutOfBound hatasini alirsiniz.
     */
    awesomeArray[4] = "Mehtap"
//    awesomeArray[5] = "Mehtap" // Calismaz. Comment'i kaldir kontrol et istersen keko

}