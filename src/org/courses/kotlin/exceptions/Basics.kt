package org.courses.kotlin.exceptions

import kotlin.system.exitProcess

fun main() {
    var num1: Int = 0
    var num2: Int = 0

    do {
        print("Enter primary number [q to quit]: ")
        val input = readLine()
        if (input.equals("q")) {
            exitProcess(0)
        }
        val res1 = try {
            num1 = input!!.toInt()
            println ("Number entered: $num1")
            print ("Enter secondary number: ")
            num2 = readLine()!!.toInt()
            num1 + num2
        } catch (e: NumberFormatException) {
            println ("Ooooops. Entered number is not an integer. Try again")
            continue
        } catch (e: Exception) {
            println ("Unknown exception: $e")
        } finally {
            println ("Come on, another sum!")
        }
        println ("$num1 + $num2 = $res1")
    } while (true)
}