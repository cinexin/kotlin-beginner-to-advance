package org.courses.kotlin.conditionals

fun main() {
    print("Enter your age: ")
    val age: Int = readLine()?.toInt() ?: 0

    if (age >= 90) {
        println ("You are an adult")
    } else {
        println ("You are young")
    }
}