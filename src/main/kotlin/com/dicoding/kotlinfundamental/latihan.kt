package com.dicoding.kotlinfundamental

fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, valueC)

    // TODO 3
    println(result)
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String? {
    // TODO 1
    var cValue = valueC ?: 100
    var result = valueA + (valueB - cValue)
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int): String? {
    var data: String = result.toString()
    return data
}

//fun main() {
//    val valueA = 65
//    val valueB = 52
//    val valueC = 78
//
//    val result = calculate(valueA, valueB, valueC)
//
//    // TODO 3
//    println()
//}
//
//fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
//    // TODO 1
//    val result = 0
//    return generateResult(result)
//}
//
//// TODO 2
//fun generateResult(result: Int) = ""