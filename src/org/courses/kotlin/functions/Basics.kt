package org.courses.kotlin.functions

import java.lang.IllegalArgumentException

fun main() {
    for (i in 1..5) {
        helloWorld()
    }
    sum (56, 89)
    product(45, 62.34f, 0.000009)
    product(12, 23.54f, 23.45)

    val res = calculator(3)
    println ("Result = $res")

    print ("Summation of i:1 to 4 for 2 = ${summation(1, 4, 2)}")
}

/**
 * Basic function
 */
fun helloWorld() {
    println ("Hello world")
}

/**
 * Parameterized functions
 */
fun sum(a: Int, b: Int) {
    val sum = a + b
    println("$a + $b = $sum")
}

fun product(a: Int, b:Float, c: Double) {
    val product = a * b * c
    println ("$a x $b x $c = $product")
}

/**
 * Single statement return functions
 */
fun calculator (option: Int) =
        when (option) {
            1 -> {
                12 + 13
            }
            2 -> {
                12 - 13
            }
            3 -> {
                12 / 12
            }
            else -> throw IllegalArgumentException("Enter a valid option")
        }

/**
 * Function returning value
 *
 * ie: summation(i = 0, i = N, num = 5)
 * summation = 5 + 5 + 5 + 5 + ...... + 5
 */
fun summation(lowerBound: Int,
              upperBound: Int,
              num: Int): Int {
    var summation = 0
    for (i in lowerBound..upperBound) {
        summation += num
    }
    return summation
}