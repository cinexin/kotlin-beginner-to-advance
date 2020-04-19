package org.courses.kotlin.iterators

fun main() {
    // pyramid by using nested loop
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        print("\n")
    }
}