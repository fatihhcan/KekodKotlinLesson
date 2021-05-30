package homework

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 29.05.2021                 │
//└────────────────────────────┘

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import kotlin.properties.Delegates


private operator fun String.minus(date1: String?): String {

    val string1 = this
    val string2 = date1
    val splittedCurrentDate = string1.split("/")
    val splitteduserBirthDate = string2?.split("/")

    var lastDay: Byte = 0
    var lastMonth: Byte = 0
    var lastYear: Short = 0
    if (!splitteduserBirthDate.isNullOrEmpty()) {
        val currentDateArray = shortArrayOf(splittedCurrentDate[0].toShort(), splittedCurrentDate[1].toShort(), splittedCurrentDate[2].toShort())
        val userBirthDateArray = shortArrayOf(splitteduserBirthDate[0].toShort(), splitteduserBirthDate[1].toShort(), splitteduserBirthDate[2].toShort())
        if (currentDateArray[0] > userBirthDateArray[0] || currentDateArray[0] == userBirthDateArray[0]) {
            lastDay = (currentDateArray[0] - userBirthDateArray[0]).toByte()
        } else {
            currentDateArray[1]--
            currentDateArray[0] = (currentDateArray[0] + 30).toShort()
            lastDay = (currentDateArray[0] - userBirthDateArray[0]).toByte()
        }
        if (currentDateArray[1] > userBirthDateArray[1] || currentDateArray[1] == userBirthDateArray[1]) {
            lastMonth = (currentDateArray[1] - userBirthDateArray[1]).toByte()
        } else {
            currentDateArray[2]--
            currentDateArray[1] = (currentDateArray[1] + 12).toShort()
            lastMonth = (currentDateArray[1] - userBirthDateArray[1]).toByte()
        }
        if (currentDateArray[2] > userBirthDateArray[2] || currentDateArray[2] == userBirthDateArray[2]) {
            lastYear = (currentDateArray[2] - userBirthDateArray[2]).toShort()
        } else {
            println("What a time travaller!!")
            return ""
        }
    }
    println("Since your birthday it's been  $lastDay days, $lastMonth months and $lastYear Years ")
    return ""
}


fun main() {
    val birthDay = getBirthDate()
    val todayDate = getCurrentDate()
    todayDate - birthDay

}

fun getCurrentDate(): String {
    val currentDate = SimpleDateFormat("dd-MM-YYYY").format(Date())
    val newString = currentDate.split("-")[0] + "/" + currentDate.split("-")[1] + "/" + currentDate.split("-")[2]
    return newString
}

private fun validateDate(isDate: String): Boolean {
    var day: Byte by Delegates.vetoable(0){property, oldValue, newValue ->
        if (newValue>31) (
                throw IllegalArgumentException("Days can't be more than 31!")
                ) else {
            newValue > oldValue
        }
    }
    var month: Byte by Delegates.vetoable(0){property, oldValue, newValue ->
        if (newValue>12) (
                throw IllegalArgumentException("Months can't be more than 12!")
                ) else {
            newValue > oldValue
        }
    }
    val year: Short
    try {
        day = isDate.split("/")[0].toByte()
        month = isDate.split("/")[1].toByte()
        year = isDate.split("/")[2].toShort()

    } catch (e: Exception) {
        println(e.message)
        return false
    }
    return true
}

private fun getBirthDate(): String {
    println("Please input your Birth Date (DD/MM/YYYY)")
    var birthDate: String? = readLine()
    var isValid = false
    while (!isValid) {
        when (validateDate(birthDate!!)) {
            false -> {
                println("Your input was incorrect! Please input date with CORRECT format (DD/MM/YYYY)")
                birthDate = readLine()
            }
            true -> {
                isValid = true
            }
        }
    }
    return birthDate!!
}