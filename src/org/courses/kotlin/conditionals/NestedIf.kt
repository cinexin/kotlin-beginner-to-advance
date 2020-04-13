package org.courses.kotlin.conditionals

fun main() {

    print("Enter your age: ")
    val age: Int = readLine()?.toInt() ?: 0

    if (age <= 45) {
        if (age in 1..10) {
            println ("You are a child")
        }
        if (age in 13..19) {
            println ("You are a teenager")
        }
    } else {
        println("You are an adult")
    }
}