package functions

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 30.05.2021                 │
//└────────────────────────────┘

fun main() {
    val totalArea = 200
    val totalPerimeter = 60

    val areaInfo = { area: Int ->

    }

    val areaInfo2 = fun(area: Int) {

    }

    calculate(10, {

    }, { perimeter: Int ->

    })

    calculate(10, areaInfo, { perimeter: Int ->

    })

    calculate(10, areaInfo2, { perimeter: Int ->

    })

    calculate(10, ::areaInfo, { perimeter: Int ->

    })



    calculate2(10, totalPerimeter, { area ->
        println("Area : $area")
        val squareCount = totalArea / area
        println("Square Count : $squareCount")
    }, { perimeter, squareCountCalculate ->
        println("Perimeter : $perimeter")

        println("Square Count : ${squareCountCalculate(10)}")
    })
}

fun areaInfo(area: Int) {

}

fun calculate(
    number: Int,
    areaInfo: (Int) -> Unit,
    perimeterInfo: (perimeter: Int) -> Unit
) {
    val area = number * number
    areaInfo(area)
    val perimeter = number * 4
    perimeterInfo(perimeter)
}

fun calculate2(
    number: Int,
    totalPerimeter: Int,
    areaInfo: (area: Int) -> Unit = { },
    perimeterInfo: (Int, squareCountCalculate: (squareCount: Int) -> Int) -> Unit
) {
    val area = number * number
    areaInfo(area)
    val perimeter = number * 4
    perimeterInfo(perimeter, {
        totalPerimeter / perimeter
    })
}