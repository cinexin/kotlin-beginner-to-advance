package org.courses.kotlin.functions

fun main() {
    val str1 = "Hi"
    val str2 = "How"
    val str3 = "are"
    val str4 = "you?"

    println (str1.concat(str2, str3, str4))

    val numbers = listOf(23, 56, 45, 9, 84)
    println ("Summation of $numbers = ${numbers.summation()}")
}

fun String.concat(str1: String, str2: String, str3: String): String =
        this.plus( " $str1").plus(" $str2").plus(" $str3")

fun List<Int>.summation(): Int = this.reduce { num, acc -> acc + num}