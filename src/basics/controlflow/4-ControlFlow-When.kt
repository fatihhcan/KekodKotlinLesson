package basics.controlflow

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
     *      switch case'lerin yerine gelmistir.
     *      when(karsilastirilacak_ifade)
     *          value -> {}
     *          value -> {}
     *          else -> {}
     *      formatiyla kullanilir.
     *      Yine {} arasina tek satir kod yazilacaksa bu durumda {}'leri kullanmayabilirsiniz.
     *      "tr", "az" gibi ayni kodu calistiracak case'ler varsa araya virgul koyarak kullanabiliriz.
     *      Bu "veya" kullanimi yapmayi saglar. "tr veya az" gibi.
     * **/

    val countryCode = readLine()!!
    when (countryCode.toLowerCase()) {
        "tr", "az" -> println("Türk Vatandası")
        "ar" -> println("Arab Vatandası")
        "fr" -> println("France Vatandası")
        "ru" -> println("Russian Vatandası")
        "uk" -> println("United Kingdom Vatandası")
    }

    when (countryCode.toInt()) {
        3.and(5) -> println("TC Vatandası")
        1 or 2 -> println("TC Vatandası")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      when'in yanina karsilastirma ifadesi eklemeden, bunu case'lerin yanina da ekleyebilirsiniz.
     *      Bunun artisi && || and or xor gibi ifadeleri de kullanabilmenizi saglar.
     * **/
    when {
        countryCode.toLowerCase() == "tr" && countryCode.toLowerCase() == "az" -> println("TC Vatandası")
        countryCode.toLowerCase() == "ar" -> println("Arab Vatandası")
        countryCode.toLowerCase() == "fr" -> println("France Vatandası")
        countryCode.toLowerCase() == "ru" -> println("Russian Vatandası")
        countryCode.toLowerCase() == "uk" -> println("United Kingdom Vatandası")
    }

    if (countryCode.toLowerCase() == "tr" || countryCode.toLowerCase() == "az")
        println("Turki Vatandası")
    else if (countryCode.toLowerCase() == "ar")
        println("Arab Vatandası")
    else if (countryCode.toLowerCase() == "fr")
        println("France Vatandası")
    else if (countryCode.toLowerCase() == "ru")
        println("Russian Vatandası")
    else if (countryCode.toLowerCase() == "uk")
        println("United Kingdom Vatandası")

    /* ------------------------------------------------------------------------ */

    /**
     *      Expression kullanimini if else'lerde oldugu gibi when'lerde de yapabilirsiniz.
     * **/
    var countryCode2: String = if (countryCode.toLowerCase() == "tr" || countryCode.toLowerCase() == "az") {
        println("Turki Vatandası")
        "90"
    } else if (countryCode.toLowerCase() == "ar") {
        println("Arab Vatandası")
        "80"
    } else if (countryCode.toLowerCase() == "fr") {
        println("France Vatandası")
        "60"
    } else if (countryCode.toLowerCase() == "ru") {
        println("Russian Vatandası")
        "50"
    } else if (countryCode.toLowerCase() == "uk") {
        println("United Kingdom Vatandası")
        "40"
    } else {
        "30"
    }

    countryCode2 = when (countryCode2.toLowerCase()) {
        "tr", "az" -> {
            println("TC Vatandası")
            "90"
        }
        "ar" -> {
            println("Arab Vatandası")
            "80"
        }
        "fr" -> {
            println("France Vatandası")
            "70"
        }
        "ru" -> {
            println("Russian Vatandası")
            "60"
        }
        "uk" -> {
            println("United Kingdom Vatandası")
            "50"
        }
        else -> {
            "40"
        }
    }

    countryCode2 = when {
        countryCode2.toLowerCase() == "tr" || countryCode2.toLowerCase() == "az" -> {
            println("TC Vatandası")
            "90"
        }
        countryCode2.toLowerCase() == "ar" -> {
            println("Arab Vatandası")
            "80"
        }
        countryCode2.toLowerCase() == "fr" -> {
            println("France Vatandası")
            "70"
        }
        countryCode2.toLowerCase() == "ru" -> {
            println("Russian Vatandası")
            "60"
        }
        countryCode2.toLowerCase() == "uk" -> {
            println("United Kingdom Vatandası")
            "50"
        }
        else -> {
            "40"
        }
    }


/* -------------------------------------------------------------------------------------------------------------------*/

    //karsilastirilacak sey "deger" yerine "degisken" de olabilir.
    val trCode = "tr"
    val arCode = "ar"
    val frCode = "fr"
    val ruCode = "ru"
    val ukCode = "uk"
    when (countryCode.toLowerCase()) {
        trCode, "az" -> println("TC Vatandası")
        arCode -> println("Arab Vatandası")
        frCode -> println("France Vatandası")
        ruCode -> println("Russian Vatandası")
        ukCode -> println("United Kingdom Vatandası")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    // is !is ile bir class'in referansi olunup olunmadigi kontrolu yapilabilir.
    val phoneNumber: Long = 5316266922
    when (phoneNumber) {
        is Long -> {
            println("Long value")
        }
        !is Long -> {
            println("Long value")
        }
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    // range'leri in !in seklinde kontrolu yapilabilir.
    val number = 3
    when (number) {
        in 0..10 -> {
            println("Long value")
        }
        in 11..20 -> {
            println("Long value")
        }
        !in 11..20 -> {
            println("Long value")
        }
    }
}