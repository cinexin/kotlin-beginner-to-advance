package org.courses.kotlin.ooo

class Singleton {
    private constructor() {
        println ("This is a singleton class")
    }

    companion object {
        val single: Singleton by lazy { Singleton() }
    }
}

fun main() {
    val s1 = Singleton.single
    val s2 = Singleton.single
    val s3 = Singleton.single
}