package org.courses.kotlin.data_structures

fun main() {
    val array = Array(3) {IntArray(3)}
    array[0][0] = 12

    for (i in 0..2) {
        for (j in 0..2) {
            print ("Enter a number at $i row $j column: ")
            val number = readLine()?.toInt() ?: 0
            array[i][j] = number
        }
    }

    for (i in 0..2) {
        for (j in 0..2) {
            println ("array[$i,$j]: ${array[i][j]}")
        }
    }
}