package org.courses.kotlin.data_structures

fun main() {

    val myList = mutableListOf(1, 2, "kotlin", true, 3.14f)
    myList[0] = "Kotlin"
    myList.add("Java")

    for (item in myList) {
        println (item)
    }
}