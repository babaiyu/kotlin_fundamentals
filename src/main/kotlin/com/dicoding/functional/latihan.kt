package com.dicoding.functional

fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println("The first and last of Kotlin $firstChar and $lastChar")

}

// TODO 1
fun String.getFirstAndLast() = mapOf(
    Pair(first = "first", second = first()),
    Pair(first = "last", second = last())
)

//fun main() {
//    val text = "Kotlin".getFirstAndLast()
//
//    val firstChar = text["first"]
//    val lastChar = text["last"]
//
//    // TODO 2
//    println()
//
//}
//
//// TODO 1
//fun String.getFirstAndLast() = mapOf<String, Char>()