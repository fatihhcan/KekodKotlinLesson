package homework

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 29.05.2021                 │
//└────────────────────────────┘

import java.util.*

fun main() {

    print("Please enter your birthdate in dd.mm.yyyy format: ")
    val userInput: String? = readLine()

    //System fails when user enters no value
    // a value that consist two consecutive dots ".."
    // a value that starts with "."
    //a value that ends with "."
    if (
        !userInput.isNullOrEmpty()
        && !userInput.contains("..")
        && userInput[0] != '.'
        && userInput[userInput.length - 1] != '.'
    ) {

        //first, convert string array to Int list, then Int array
        val userDate = userInput.split(".").map { it.toInt() }.toTypedArray()

        //userDate[0]= day
        //userDate[1]= month
        //userDate[2]= year


        //Check if day, month, year correctly separated
        if(userDate.size != 3){
            printErrorMessage()
        }else{
            if (isDatesValid(userDate)) {

                val todayDate = getTodayDate()
                calculateDifference(userDate, todayDate)

            } else {
                printErrorMessage()
            }
        }

    } else {
        printErrorMessage()
    }


}

fun isDatesValid(userDate: Array<Int>): Boolean {

    return userDate[0] in 1..30 && userDate[1] in 1..12 && userDate[2] in 1000..9999

}

fun getTodayDate(): Array<Int> {
    val date = Calendar.getInstance()
    val day = date.get(Calendar.DAY_OF_MONTH)
    var month = date.get(Calendar.MONTH)
    val year = date.get(Calendar.YEAR)

    //month indexed from 0..11 so add +1
    month += 1

    return arrayOf(day, month, year)
}

fun calculateDifference(userDate: Array<Int>, todayDate: Array<Int>) {

    // if user day is greater than today month
    // then don't count this month and
    // add 30 to the today day
    if (userDate[0] > todayDate[0]) {
        todayDate[1] = todayDate[1] - 1
        todayDate[0] = todayDate[0] + 30
    }

    // if user month is greater than today month,
    // then don't count this year and add
    // 12 to the today month
    if (userDate[1] > todayDate[1]) {
        todayDate[2] = todayDate[2] - 1
        todayDate[1] = todayDate[1] + 12
    }

    val todayDatePair = DatePair(todayDate[0], todayDate[1], todayDate[2])
    val userDatePair = DatePair(userDate[0], userDate[1], userDate[2])


    val result = todayDatePair - userDatePair
    todayDatePair - userDatePair
    todayDatePair.minus(userDatePair)

}

data class DatePair(val day: Int, val month: Int, val year: Int) {
    operator fun minus(datePair: DatePair): DatePair {
        val returnPairObject = DatePair(
            day - datePair.day,
            month - datePair.month,
            year - datePair.year
        )

        println("Since your birth ${returnPairObject.day} days, ${returnPairObject.month} months, ${returnPairObject.year} years has passed")

        return returnPairObject
    }

}

fun printErrorMessage() {
    println("Please enter a valid date")
}