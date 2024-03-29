package com.dicoding.coroutines

import kotlinx.coroutines.*

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000)
    return valueA + valueB
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000)
    return valueA * valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3

    println(
        """
            Result sum: ${resultSum.await()}
            Result Multiple: ${resultMultiple.await()}
        """.trimIndent()
    )
}

//import kotlinx.coroutines.*
//
//// TODO 1
//fun sum(valueA: Int, valueB: Int): Int {
//    return 0
//}
//
//// TODO 2
//fun multiple(valueA: Int, valueB: Int): Int {
//    return 0
//}
//
//fun main() = runBlocking {
//
//    println("Counting...")
//
//    val resultSum = async { sum(10, 10) }
//    val resultMultiple = async { multiple(20, 20) }
//
//    // TODO 3
//    println()
//}