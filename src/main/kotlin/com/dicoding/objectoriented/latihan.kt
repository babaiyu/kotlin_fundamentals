package com.dicoding.objectoriented

// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false
        get() {
            println("Fungsi Getter dipanggil")
            return field
        }
        set(value) {
            println("Fungsi Setter dipanggil")
            field = value
        }

    fun toSleep() {
        if (sleep) {
            println("$name, sleep!")
        } else {
            println("$name, let's play!")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}

//// TODO 1
//class Cat(private val name: String) {
//    var sleep: Boolean = false
//
//    fun toSleep() {
//        println()
//    }
//}
//
//fun main() {
//
//    // TODO 2
//    val gippy = Cat("")
//
//    gippy.toSleep()
//    gippy.sleep = true
//    gippy.toSleep()
//}