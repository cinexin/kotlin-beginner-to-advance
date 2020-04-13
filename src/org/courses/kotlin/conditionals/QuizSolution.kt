package org.courses.kotlin.conditionals

import kotlin.system.exitProcess

@Suppress("IMPLICIT_CAST_TO_ANY")
fun main() {
    print ("Enter an option (1 - add / 2 - subtract / 3 - multiply / 4 - divide) - (1 / 2 / 3 / 4): ")
    val option = readLine()?.toInt() ?: 0
    if (option !in 1..4) {
        println ("Enter a valid option")
        exitProcess (0)
    }

    print ("Enter the first number: ")
    val num1 = readLine()?.toInt() ?: 0
    print ("Enter the second number: ")
    val num2 = readLine()?.toInt() ?: 1

    when (option) {
        1 -> print("$num1 + $num2 = ${num1 + num2}")
        2 -> print("$num1 - $num2 = ${num1 - num2}")
        3 -> print("$num1 * $num2 = ${num1 * num2}")
        4 -> print("$num1 / $num2 = ${num1.toDouble().div (num2)}")
        else -> {
            println ("Enter a valid option")
        }
    }
}