package org.courses.kotlin.operators

fun main() {
    var num1: Int = 10
    var num2: Int = 8

    var res1 = num1 == num2
    println (res1)

    var res2 = num1 > num2
    var res3 = num2 < num2

    var res4 = num1 >= num2
    var res5 = num1 <= num2

    println ("$res2 - $res3 - $res4 - $res5")

    var name1: String = "Kotlin"
    var name2: String = "Kotlin"

    var cmp1 = name1 == name2
    println ("cmp1 (I): $cmp1")

    name2 = "kotlin"
    cmp1 = name1 == name2
    println ("cmp1 (II): $cmp1")

    var name3: String = "abc"
    var name4: String = "abcd"
    var cmp2 = name3.length >= name4.length
    println ("cmp2: $cmp2")

    name4 = "abc"
    var cmp3 = name3 == name4
    println("cmp3: $cmp3")
}