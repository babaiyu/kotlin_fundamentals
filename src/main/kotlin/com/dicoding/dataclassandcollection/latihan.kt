package com.dicoding.dataclassandcollection

fun main() {

    // TODO 1
    val user = mapOf(
        "nama" to "John",
        "age" to "23",
        "address" to "St. Petersburg"
    )

    // TODO 2
    val name = user.getValue("nama")
    val age = user.getValue("age")
    val address = user.getValue("address")

    // TODO 3
    println(
        """
            User
            Name: $name
            Age: $age
            Address: $address
        """.trimIndent()
    )

}

//fun main() {
//
//    // TODO 1
//    val user = mapOf<String, String>()
//
//    // TODO 2
//    val name = user.getValue("")
//    val age = user.getValue("")
//    val address = user.getValue("")
//
//    // TODO 3
//    println()
//
//}