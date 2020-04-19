package org.courses.kotlin.iterators

fun main() {

    // calculate the factorial of a number using the "for" loop...
    val num = 5
    var fact = 1

    for (i in 1..num) {
        fact *= i
    }

    println ("Factorial is: $fact")
}