package org.courses.kotlin.iterators

fun main() {

    print ("Enter a number for table: ")
    val number = readLine()?.toInt() ?: 0

    var counter = 1
    while (counter <= 10) {
        println ("$number * $counter = ${number * counter}")
        counter++
    }
}