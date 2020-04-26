package org.courses.kotlin.ooo

class OverLoad {

    fun sum(num1: Int,  num2: Int): Int = num1 + num2

    fun sum(num1: Int, num2: Int, num3: Int): Int = num1 + num2 + num3

    fun sum(num1: Int) = num1
}

fun main() {
    val overload = OverLoad()
    println ("12 + 13 = ${overload.sum(12, 13)}")
    println ("12 + 13 + 14 = ${overload.sum(12, 13, 14)}")
    println ("12 is ${overload.sum(12)}")
}