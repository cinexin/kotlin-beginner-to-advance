package org.courses.kotlin.ooo

abstract class Account {
    var number: Int = 1234
    var balance: Int = 500

    fun getData() {
        println ("\nAcc no: $number\nBalance: $balance")
    }
}

class Info: Account() {
    fun get() {
        getData()
    }
}

fun main() {
    val accountInfo = Info()
    accountInfo.get()
}