package basics.loop

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
     *      3 farkli sekilde for tanimlayabilirsiniz.
     *      value in list                       seklinde value degerlerini alabilirsiniz.
     *      index in list.indices               seklinde index degerlerini alabilirsiniz.
     *      (index,value) in list.withIndex()   seklinde index,value degerlerini alabilirsiniz.
     * **/

    for (value: Int in 1..10) {
        print("$value ")
    }

    val countryCodeArray = arrayOf("tr", "az", "en", "fr")

    for (value in countryCodeArray) {
        print("$value ")
    }

    for (index in countryCodeArray.indices) {
        print("\n$index . değeri : ${countryCodeArray[index]} ")
    }

    for ((index, value) in countryCodeArray.withIndex()) {
        print("\n$index . değeri : $value ")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      repeat(size) seklinde herhangi bir listeye ihtiyac duymadan tekrarlayan isler yapabilirsiniz.
     * **/
    repeat(10) {
        print("\nDaha çok blog yazmam lazım!")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      return kullanarak ilgili sart saglanirsa, donguden cikabilirsiniz.
     *      continue kullanarak ilgili sart saglanirsa, donguye o degeri atlayarak devam edebilirsiniz.
     * **/

    for (value in 1..50) {
        if (value % 2 == 1) {
            continue
        }
        print("\n$value")
    }

    for (value in 1..50) {
        if (value % 2 == 1) {
            break
        }
        print("\n$value")
    }

    /**
     *      Iç içe for donguleri kullaniyorsak bir ustteki for'a degil de iki ustteki uc ustteki for'a donmek istiyorsak
     *      label kullanabiliriz. bunun icin labelname@ ifadesini ilgili for'un onune yazip, return ya da continue yapacagimiz
     *      yere ise @labelname seklinde yazmamiz yeterlidir.
     * **/

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue
            }

            print("continue1 : $value2 | ")
        }
    }

    println("")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnLabel
            }

            print("continue2 : $value2 | ")
        }
    }

    println("")

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break
            }

            print("break1 : $value2 | ")
        }
    }

    println("")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break@returnLabel
            }

            print("break2 : $value2 | ")
        }
    }
}