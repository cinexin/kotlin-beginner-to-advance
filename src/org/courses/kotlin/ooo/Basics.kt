package org.courses.kotlin.ooo

class Dog {
    var name: String = ""
    var color: String = ""
    var weight: Int = 0
    var gender: String = ""
    var age: Int = 0

    fun mood(mood: String) {
        println ("Dog $name with color $color that weights $weight Kg is $mood")
    }

    constructor(name: String, color: String, weight: Int) {
        this.name = name
        this.color = color
        this.weight = weight
    }

    constructor(gender: String, age: Int) {
        this.gender = gender
        this.age = age
    }

    fun print() {
        println("Name: $name - Color: $color - weight: $weight - gender: $gender - age: $age")
    }
}

fun main() {
    val zelda = Dog("Zelda", "Black", 30)
    zelda.mood("sad")

    val link = Dog ("Link", "White", 35)
    link.mood("angry")

    val mario = Dog ("Male", 10)
    mario.name = "Mario"
    mario.color = "red"
    mario.weight = 50
    val daisy = Dog ("Female", 15)
    daisy.name = "Daisy"
    daisy.color = "White"
    daisy.weight = 45
    
    mario.print()
    daisy.print()
    
}