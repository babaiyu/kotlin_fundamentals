package com.dicoding.controlflow

fun main() {
    val listNumber = 1.rangeTo(30)

    for (number in listNumber) {
        // TODO 1
        if (number % 2 == 0) continue

        // TODO 2
        if (number > 10) continue

        // TODO 3
        val result = number * (number + 2)
        println("result is $result")
    }
}

//fun main() {
//    val listNumber = 1.rangeTo(30)
//
//    for (number in listNumber) {
//        // TODO 1
//        if (false) continue
//
//        // TODO 2
//        if (false) break
//
//        // TODO 3
//        val result = 0
//        println("result is $result")
//    }
//}