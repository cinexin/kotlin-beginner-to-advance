package org.courses.kotlin.functions

fun main() {
    val numbers = listOf(1, 5, 89, 3, 5)
    println ("Prod of numbers = ${numbers.prod(5)}")
}

/**
 * Multiply all numbers of input list by [num]
 */
infix fun List<Int>.prod(num: Int): List<Int> = this.map { it * num }