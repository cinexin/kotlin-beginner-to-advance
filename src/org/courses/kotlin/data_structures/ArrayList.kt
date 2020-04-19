package org.courses.kotlin.data_structures

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("Kotlin")
    arrayList.add("Java")
    arrayList.add("Python")
    arrayList.add("C#")
    arrayList.add("TypeScrypt")

    arrayList.removeAt(2)

    println (arrayList[2])

    for (item in arrayList) {
        println (item)
    }
}