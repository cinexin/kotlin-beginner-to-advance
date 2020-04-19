package org.courses.kotlin.data_structures

fun main() {
    val myArray = arrayOf(1, 2, 3, 4, "data", "kotlin", true, 3.1416f)
    println ("myArray[2] = ${myArray[2]}")
    
    for (item in myArray) {
        println (item)
    }
}