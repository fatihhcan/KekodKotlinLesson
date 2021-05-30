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
     *      Type    |   Size (bits) |       Min value                           |   Max value
     *      --------------------------------------------------------------------------------------
     *      Byte    |   8 bit       |       -128                                |   127
     *      Short   |   16 bit      |       -32768                              |   32767
     *      Int     |   32 bit      |       -2,147,483,648 (-2^31)              |   2,147,483,647 (2^31 - 1)
     *      Long    |   64 bit      |       -9,223,372,036,854,775,808 (-2^63)  |   9,223,372,036,854,775,807 (2^63 - 1)
     */

    /**
     *      Type    |   Size (bits) |   Significant bits    |   Exponent bits   |   Decimal digits
     *      --------------------------------------------------------------------------------------
     *      Float   |       32      |           24          |       8           |       6-7
     *      Double  |       64      |           53          |       11          |       15-16
     */

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Degiskene deger atamasi yapilirken maksimum performans almak icin dogru degisken tipini kullanmak onemlidir.
     *      Bunun icin degiskenlerin deger araliklarini yukaridan kontrol edebilirsiniz.
     *      Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyuk degilse tipi default olarak Int set edilir.
     *      Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyukse tipi default olarak Long set edilir.
     */

/* -------------------------------------------------------------------------------------------------------------------*/

    val minByteValue: Byte = Byte.MIN_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE

    val minShortValue: Short = Short.MIN_VALUE
    val maxShortValue: Short = Short.MAX_VALUE

    val minIntValue: Int = Int.MIN_VALUE
    val maxIntValue: Int = Int.MAX_VALUE

    val minLongValue: Long = Long.MIN_VALUE
    val maxLongValue: Long = Long.MAX_VALUE

    val minFloatValue: Float = Float.MIN_VALUE
    val maxFloatValue: Float = Float.MAX_VALUE

    val minDoubleValue: Double = Double.MIN_VALUE
    val maxDoubleValue: Double = Double.MAX_VALUE

    println("minByteValue :" + minByteValue)
    println("maxByteValue :" + maxByteValue)
    println("minShortValue :" + minShortValue)
    println("maxShortValue :" + maxShortValue)
    println("minIntValue :" + minIntValue)
    println("maxIntValue :" + maxIntValue)
    println("minLongValue :" + minLongValue)
    println("maxLongValue :" + maxLongValue)
    println("minFloatValue :" + minFloatValue)
    println("maxFloatValue :" + maxFloatValue)
    println("minDoubleValue :" + minDoubleValue)
    println("maxDoubleValue :" + maxDoubleValue)

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Long        degiskenler icin sayinin sonuna "L" konularak deger atamasi yapilabilir.
     *      Float       degiskenler icin sayinin sonuna "F" ve "f" konularak deger atamasi yapilabilir.
     *      Double      degiskenler icin geleneksel gosterim desteklenir.
     *      Decimal     tanimi yapilabilir      [0-9]
     *      Octal       tanimi yapilamiyor      [0-7]
     *      Hexadecimal tanimi yapilabilir
     *      Binary      tanimi yapilabilir      [0-1]
     */

    val longNumber = 1586L
    val floatNumber1 = 19.90F
    val floatNumber2 = 13f
    val doubleNumber = 3.14
    val doubleNumber2 = 3.14e10
    val decimalNumber = 1907
//    val octalNumber = 0197    // Calismaz. Comment'i kaldir kontrol et istersen keko
    val hexadecimalNumber = 0x759
    val binaryNumber = 0b01000011

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Number degisken tanimi yapilirken underscore "_" kullanilabilir.
     */

    val oneMillion = 1_000_000 // 1000000
    val creditCardNumber = 1234_5678_9012_3456L
    val bytes = 0b01000011_01101111_01100100_01100101_01101101_01111001

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Boxed   : Degiskenin obje referansi olarak tutulmasidir.
     *      UnBoxed : Degiskenin primitive olarak tutulmasidir.
     *     ===  operatoru degiskenlerin referansını karsilastirirken kullanilir.
     *     ==   operatoru degiskenlerin degerini karsilastirirken kullanilir.
     */

    val number: Int = 10000 // int
    println(number === number) // true
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number
    println(boxedNumber === anotherBoxedNumber) // false

    val number2: Int = 10000
    println(number2 == number2) // true
    val boxedNumber2: Int? = number2
    val anotherBoxedNumber2: Int? = number2
    println(boxedNumber2 == anotherBoxedNumber2) // true

    /**
     *      Backend'ten donen Double ve Float degiskenleri kullanirken dikkatli olmaniz gerekiyor.
     *      Eger backend'ten donen deger uzerinde "." isaretine gore bir split isi yapacaksaniz basiniz agriyabilir.
     *      Cunku backend'ten donen Double ve Float degiskenleri her zaman "." ile ayrismiyor olabilir.
     *      Database dilinin farkli olmasina gore (turkce-ingilizce gibi) "." yerine "," ile de ayrisiyor olabilir.
     */
}