package org.courses.kotlin.ooo

enum class CompVendor {
    IBM,
    DELL,
    APPLE
}

enum class CompModel {
    THINKPAD,
    IDEAPAD,
    ALIENWARE,
    IMAC,
    MACBOOK
}

enum class OS {
    WINDOWS,
    LINUX,
    MACOS
}

class ComputerInfo(val vendor: CompVendor, val model: CompModel)
class ComputerOS(val os: OS, val version: Int)

interface Computer {

    fun info(): ComputerInfo

    fun os(): ComputerOS

    private fun printTitle() {
        val title = "${this.info().model} FEATURES"
        repeat(title.length) { print("-") }.also { print ("\n") }
        println (title)
        repeat(title.length) { print("-") }.also { print ("\n") }
    }
    fun printFeatures() {
        printTitle()
        println("Model: ${info().model} - Vendor: ${info().vendor}")
        println ("OS: ${os().os} - Version: ${os().version}")
    }
}

class ThinkPad: Computer {
    override fun info(): ComputerInfo = ComputerInfo(CompVendor.IBM, CompModel.THINKPAD)

    override fun os(): ComputerOS = ComputerOS(OS.LINUX, 4)
}

class MacbookPro: Computer {
    override fun info(): ComputerInfo = ComputerInfo(CompVendor.APPLE, CompModel.MACBOOK)

    override fun os(): ComputerOS = ComputerOS(OS.MACOS, 13)
}

class Alienware: Computer {
    override fun info(): ComputerInfo = ComputerInfo(CompVendor.DELL, CompModel.ALIENWARE)

    override fun os(): ComputerOS = ComputerOS(OS.WINDOWS, 10)

}

fun main() {
    MacbookPro().printFeatures()
    ThinkPad().printFeatures()
    Alienware().printFeatures()
}