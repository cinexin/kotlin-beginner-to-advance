package org.courses.kotlin.conditionals

fun main() {
    print("Enter the grade: ")
    val grade: Int = readLine()?.toInt() ?: 0

    if (grade in 90..100) {
        println ("Your grade is A+")
    } else {
        if (grade in 80..89) {
            println ("Your grade is A")
        } else {
            if (grade in 70..79) {
                println ("Your grade is B")
            } else {
                if (grade in 60..69) {
                    println ("Your grade is C")
                } else {
                    if (grade in 50..59) {
                        println ("Your grade is D")
                    } else {
                        if (grade in 0..49) {
                            println ("Your grade is F")
                        } else {
                            println ("Wrong grade entered (Enter a grade between 0 - 100)")
                        }
                    }
                }
            }
        }
    }
}