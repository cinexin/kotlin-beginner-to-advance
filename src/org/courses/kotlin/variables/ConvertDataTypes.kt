package org.courses.kotlin.variables

fun main() {
    var num1: Int = 10
    var name: String = "Kotlin"
    var f: Float = 3.14f
    var name2: String = "10"

    var res1 = f.toInt()
    var res2 = num1.toFloat()
    var res3 = name2.toInt()

    println ("Float to Int: $res1")
    println ("Int to float: $res2")
    println ("String to Int: $res3")
}