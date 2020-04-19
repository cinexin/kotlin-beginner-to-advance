package org.courses.kotlin.iterators

fun main() {
    for (i in 1..5) {
        if (i == 1) {
            println ("I am in for loop")
            continue
        }
        if (i == 2) {
            break
        }
    }
    println("I am out of for loop")
}