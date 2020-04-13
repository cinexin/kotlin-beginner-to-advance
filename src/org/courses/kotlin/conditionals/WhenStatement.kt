package org.courses.kotlin.conditionals

fun main() {
    print ("Enter a character: ")

    when (val chr: Char = readLine()?.get(0) ?: '0') {
        'a' -> { println("You entered a vowel $chr") }
        'e' -> { println("You entered a vowel $chr") }
        'i' -> { println("You entered a vowel $chr") }
        'o' -> { println("You entered a vowel $chr") }
        'u' -> { println("You entered a vowel $chr") }
        else -> { println("You entered a consonant") }
    }
}