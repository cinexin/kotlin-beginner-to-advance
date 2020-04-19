package org.courses.kotlin.data_structures

fun main() {
    val array = Array<Int>(size = 5) {0}

    array[0] = 12
    array[1] = 13
    array[2] = 14
    array[3] = 15
    array[4] = 16

    for (i in 0..4) {
        print ("Enter elements at $i location: ")
        val element = readLine()?.toInt() ?: 0
        array[i] = element
    }

    for (item in array) {
        println ("Array elements: $item")
    }
}