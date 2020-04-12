package org.courses.kotlin.operators

fun main() {
    var res1 = 7 < 6 && 8 < 10 && 3 > 2
    var res2 = 7 > 6 && 5 < 3 && 2 > 10

    println ("res1: $res1 - res2: $res2")

    var res3 = 5 > 6 || 7 > 3 || 2 > 10
    println ("res3(I): $res3")

    res3 = 5 > 6 || 7 < 3 || 2 > 10
    println ("res3 (II): $res3")

    res3 = !res3
    println("res3 (III): $res3")
}