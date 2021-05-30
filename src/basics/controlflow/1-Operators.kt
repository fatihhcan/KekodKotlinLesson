package basics.controlflow

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 22.05.2021                 │
//└────────────────────────────┘

fun main(args: Array<String>) {

    var numberOne = 10
    val numberTwo = 5

    println("NumberOne : ${numberOne}")
    println("NumberOne : ${numberOne++}")
    println("NumberOne : ${numberOne}")
    println("NumberOne : ${++numberOne}")

    print("${numberOne + numberTwo} ")
    print(" ")
    println(numberOne.plus(numberTwo))

    print("${numberOne - numberTwo} ")
    println(numberOne.minus(numberTwo))

    print("${numberOne * numberTwo} ")
    println(numberOne.times(numberTwo))

    print("${numberOne / numberTwo} ")
    println(numberOne.div(numberTwo))

    print("${numberOne % numberTwo} ")
    println(numberOne.rem(numberTwo))

    println("------------------------------------------------------------")

    print("Final Notunu Giriniz : ")
    val grade = readLine()!!.toInt()

    val charNote = if (grade == 100) {
        "$grade = AA"
    } else if (grade <= 99 && grade >= 80) {
        "$grade = BB"
    } else if (grade <= 79 && grade >= 50) {
        "$grade = CC"
    } else if (grade <= 49 && grade >= 20) {
        "$grade = DD"
    } else if (grade <= 19 && grade >= 0) {
        "$grade = FF"
    } else {
        "$grade = Bulunamadı!!"
    }

    println("------------------------------------------------------------")

    println(grade.compareTo(100) > 0)
    println(grade.compareTo(100) < 0)
    println(grade.compareTo(100) >= 0)
    println(grade.equals(100))
    println(grade.equals(100))
    println(!grade.equals(100))

    println(charNote)

    /*
    a > b   a.compareTo(b) > 0
    a < b   a.compareTo(b) < 0
    a >= b  a.compareTo(b) >= 0
    a <= b  a?.equals(b)?: (b === null)
    a == b  a?.equals(b)?: (b === null)
    a != b  !(a?.equals(b)?: (b === null))
    */

    println("------------------------------------------------------------")

    var a = 20
    var b = 5
    a += b
    println("a+=b :" + a)
    a -= b
    println("a-=b :" + a)
    a *= b
    println("a*=b :" + a)
    a /= b
    println("a/=b :" + a)
    a %= b
    println("a%=b :" + a)

    /*
    	a+=b    a.plusAssign(b)
    	a-=b    a.minusAssign(b)
        a*=b    a.timesAssign(b)
        a/=b    a.divAssign(b)
        a%=b    a.remAssign(b)
     */

    println("------------------------------------------------------------")

    var numbOne = 10
    var numbTwo = 5
    var flag = true
    println("+a :" + +numbOne)
    println("q-b :" + -numbTwo)
    println("++a :" + ++numbOne)
    println("a++ :" + numbOne++)
    println("a :" + numbOne)
    println("--b :" + --numbTwo)
    println("!flag :" + !flag)

    /*
    	+a      a.unaryPlus()
    	-a      a.unaryMinus()
    	++a     a.inc()
        --a     a.dec()
    	!a      a.not()
     */

    println("------------------------------------------------------------")

    /**
     *
     *      === ifadesi isaret edilen referans tipleri karsilatirir.
     *      == ifadesi degeri karsilastirir.
     */
}