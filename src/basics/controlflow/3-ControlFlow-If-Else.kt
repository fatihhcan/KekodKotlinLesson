package basics.controlflow

import java.io.IOException

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
     *      if else case'lerinden sonra suslu parantez acilir ve kapanir.
     *      Ancak bu suslu parantezler arasina tek satir kod yazacaksak, suslu parantez kullanmak zorunda degiliz.
     *      If - else case'lerinin state ve expression olmak uzere 2 kullanimi vardir. Basitce;
     *      State kullanimi sadece if else kullanarak sartli durumlarimizi kodlamaktir.
     *      Expression kullanimi ise bir value'ya deger olarak esitligin karsi tarafina if else kodlarini yazmaktir.
     *      Expression olarak yapilan kullanimda, if else case'leri icin yazilmis parantezlerin son satiri value olarak atanir
     * **/

    print("Öğrenci misin?")
    val answer = readLine()!!

    //state kullanimi
    if (answer.contains("Evet", ignoreCase = true)) {
        println("Öğrenci")
    } else {
        println("Öğrenci Değil")
    }

    // expression kullanimi. {} icerisindeki son satir, deger olarak degiskene atanir.
    val result: String = if (answer == "Evet") {
        "Öğrenci"
    } else {
        "Öğrenci Değil"
    }

    println(result)

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Kotlin'de if else'lerin Expression kullanimindan oturu ternary operatoru yoktur.
     *      Ternary yerine asagidaki gibi kullanim yapabilirsiniz.
     * **/
    val isStudent = false
    val isStudent2 = if (isStudent) {"true"} else {"false"}
//    String name2 = isStudent ? "true" : "false" ternary operator

    print("Notunuzu Giriniz : ")
    val grade = readLine()!!.toDouble()

    if (grade <= 100 && grade >= 85) {
        println("AA")
    } else if (grade < 85 && grade >= 70) {
        println("BB")
    } else if (grade < 70 && grade >= 55) {
        println("CC")
    } else if (grade < 55 && grade >= 40) {
        println("DD")
    } else {
        print("Sen okulu birak :)")
    }

//    true && true = true
//    true && false = false
//    false && true = false
//    false && false = false
//
//    true || true = true
//    true ||false = true
//    false || true = true
//    false ||false = false

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      2 farkli tipteki number degiskenler karsilastirilirken equals fonksiyonu once tiplerini karsilastirdigi icin
     *      eger tipler uyusmuyorsa, ide hata verecektir.
     * **/
//    if(10 == 10L){    // Calismaz. Comment'i kaldir kontrol et istersen keko
//
//    }

    if (10 == 10L.toInt()) {
        println("true")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Birden fazla sartli durumunuz varsa bunlarin her birini, asagidaki gibi, ayri ayri if seklinde yazmak
     *      if else seklinde yazmaktan daha kotu performans almaniza yol acar. Zira if else durumlarinda dogru case
     *      bulunursa, diger case'ler kontrol edilmez. Ancak asagidaki durumda dogru case bulunsa bile tum case'ler
     *      kontrol edilir.
     * **/
    if (grade <= 100) {

    }

    if (grade >= 85) {

    }

    if (grade <= 84) {

    }

    if (grade >= 70) {

    }

    if (grade <= 69) {

    }

    if (grade >= 55) {

    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Bazi durumlarda if else yazmaktansa, if case'ini yazip return ya da throw gibi kodun devam etmesini bozacak
     *      ifadelerle kodu sonlandirabilirsiniz. Kod calisirken bu if case'ine girmezse devam eden kod blogu calisir ki
     *      bu da pratikte else case'i demek olur. Bu sekilde yazim kodu biraz daha temiz gosterecektir.
     * **/
    if (isStudent) {
        println("Student")
    } else {
        otherMethod()
    }

    if (isStudent) {
        println("Student")
        throw IOException()
//        return
    }

    otherMethod()
}

private fun otherMethod() {

}