package com.dicoding.generics

// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("$stringResult and $intResult")
}

// TODO 1
fun <T : Any> getResult(args: T): Int? {
    return when (args) {
        is Int -> args * 5
        is String -> args.length
        else -> 0
    }
}

//// Coming Soon
//fun main() {
//    val stringResult = getResult("Kotlin")
//    val intResult = getResult(100)
//
//    // TODO 2
//    println()
//}
//
//// TODO 1
//fun <T> getResult(args: T): Int {
//    return 0
//}