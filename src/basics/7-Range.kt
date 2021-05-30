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
     *      Sonlu sayili liste olusturmaya yarar.
     * **/

    /**
     *      Kucukten buyuye liste olusturmak icin .. operatorunu, ya da rangeTo() fonksiyonunu kullanabilirsiniz.
     * **/
    val numbers = 1..100 // [1,100]
    val numbers2 = 1.rangeTo(100)
//    val numbers3 = 1 rangeTo 100

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Char'lardan olusan bir liste de tanimalanbilir. Turkce karakterleri icermez.
     * **/
    val alphabet = 'A'..'Z'

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Buyukten kucuge .. operatorunu kullanarak liste olusturamayiz. Ide hata verecektir.
     *      Buyukten kucuge liste olusturmak icin downTo() fonksiyonunu kullanabilirsiniz. Infix kullanimi da vardir.
     * **/

    //    val reversedNumbers = 100..1 // Calismaz. Comment'i kaldir kontrol et istersen keko
    val reversedNumbers = 100.downTo(1)
    val reversedNumbers2 = 100 downTo 1
    print("reversedNumbers")
    reversedNumbers.forEach { print(" " + it) }
    println()

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      until fonksiyonunu kullanarak da range tanimalanabilir. Ancak bu durumda bitis degeri listeye dahil edilmez.
     * **/
    val gradeNumbers = 10.until(100) // [10,100)
//    val gradeNumbers2 = 10.rangeTo(99) // [10,100)
//    val gradeNumbers3 = 10..99 // [10,100)
    val gradeNumbers2 = 10 until 100
    print("gradeNumbers")
    gradeNumbers.forEach { print(" " + it) }
    println()

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      step fonksiyonunu kullanarak liste olusturulurken belli sayida atlamalar yapabilirsiniz.
     * **/
    val stepedNumbers = 1..101 step (2)
    val stepedNumbers2 = 1..100 step 3
    print("stepedNumbers")
    stepedNumbers.forEach { print(" " + it) }
    println()

    val reversedStepedNumbers = 100 downTo 1 step (3)
    val reversedStepedNumbers2 = 100.downTo(100) step 2
    print("reversedStepedNumbers")
    reversedStepedNumbers.forEach { print(" " + it) }
    println()

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      CharRange, IntRange gibi primitive tiplerle de range tanimi yapilabilir.
     *      Bu durumda, first, last, step, count gibi ek bilgiler alinabilir.
     * **/
    val numberList: IntRange = 10 until 90
    numberList.first
    numberList.last
    numberList.step

    when (10) {
        in numberList -> {
            println("10 sayisi numberList icerisinde yer alir")
        }
    }

    numberList.count()

    val countBiggerThan50 = numberList.count { it > 50 }

    println(countBiggerThan50)

    println("numberList.average ${numberList.average()}")
    println("numberList.reversed ${numberList.reversed()}")
}