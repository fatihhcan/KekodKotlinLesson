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
     *      Degisen hic bir sey yok. Diger dillerde nasil kullaniyorsaniz Kotlin'de de ayni sekilde kullaniyoruz.
     *      Eger bir donguye ihtiyaciniz varsa ve bu dongu sirasinda if else ile bir sartli duruma ihtiyaciniz varsa
     *      bu durumda for + if else kullanmak yerine while kullanabilirsiniz.
     * **/

    var number = 0

    while (number < 5) {
        print("${number++} , ")
    }

    while (number < 5) {
        print("$number , ")
        number++
    }

    println("-----------------")

    for (value in 0..110) {
        if (value < 5) {
            print("$value , ")
        } else {
            return
        }
    }
}