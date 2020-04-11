package org.courses.kotlin.variables

fun main() {

    print("Enter your name: ")
    var name: String? = readLine().toString()

    print("Enter your age: ")
    var age: Int? = readLine()?.toInt()

    print("Enter your birth year: ")
    var dateOfBirth: Int? = readLine()?.toInt()

    println("name: $name age: $age Date of birth: $dateOfBirth")
}