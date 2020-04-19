package org.courses.kotlin.data_structures

fun main() {

    /**
     * HashMap...
     */
    val map = HashMap<Int, String>()
    map[1] = "Kotlin"
    map[2] = "Java"
    map[3] = "C++"
    map[4] = "Ada"

    for (key in map.keys) {
        println ("map[$key] = ${map[key]}")
    }

    // another way...
    for (item in map) {
        println (item)
    }

    println ("--------------------")
    /**
     * HashMap Of...
     */
    var map2 = mapOf(
            1 to "Kotlin",
            2 to "Pascal"
    )
    map2 = map2.plus(3 to "Borland")
    map2 = map2.plus(4 to "C")

    for (item in map2) {
        println (item)
    }
}