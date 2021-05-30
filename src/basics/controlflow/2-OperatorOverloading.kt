package basics.controlflow

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 22.05.2021                 │
//└────────────────────────────┘

data class PairNumber(val numberOne: Int, val numberTwo: Int) {

    operator fun minus(pairNumber: PairNumber): PairNumber {

        val returnPairObject = PairNumber(
            numberOne - pairNumber.numberOne,
            numberTwo - pairNumber.numberTwo
        )

        println("Sonuc = (${returnPairObject.numberOne} , ${returnPairObject.numberTwo})")

        return returnPairObject
    }

//    operator fun String.plus(value : String): Int{
//
//        return this.toInt() + value.toInt()
//    }
}

fun main(args: Array<String>) {

    val a = 5
    val b = 8

    //operatorler arka planda eslenigi olan(corresponding) methodu cagirir.
    var result = a + b
    result = a.plus(b)

    val pairNumberOne = PairNumber(2, 4)
    val pairNumberTwo = PairNumber(-8, 11)

    val resultOne = pairNumberOne.numberOne - pairNumberTwo.numberOne
    val resultTwo = pairNumberOne.numberTwo - pairNumberTwo.numberTwo
    println("Sonuc = ($resultOne, $resultTwo)")

    val pairNumber = pairNumberOne - pairNumberTwo

    val pairNumber2 = pairNumberOne - pairNumberTwo

    val pairNumber3 = pairNumberOne - pairNumberTwo

    val pairNumber4 = pairNumberOne - pairNumberTwo

    val pairNumber5 = pairNumberOne - pairNumberTwo

//    val pairNumber5 = pairNumberOne.minus(pairNumberTwo)

//    println("Sonuc = (${pairNumber.numberOne} , ${pairNumber.numberTwo})")
//
//    println("Sonuc = (${pairNumber2.numberOne} , ${pairNumber2.numberTwo})")
//
//    println("Sonuc = (${pairNumber3.numberOne} , ${pairNumber3.numberTwo})")
//
//    println("Sonuc = (${pairNumber4.numberOne} , ${pairNumber4.numberTwo})")
//
//    println("Sonuc = (${pairNumber5.numberOne} , ${pairNumber5.numberTwo})")
}