package org.courses.kotlin.ooo

open class Player1 {
    var name: String = ""
    var score: Int = 0
    var energy: Int = 0
    var weapon: String = ""

    constructor(name: String, score: Int, energy: Int, weapon: String) {
        this.name = name
        this.score = score
        this.energy = energy
        this.weapon = weapon
    }

    open fun killEnemy() {
        score += 8
        println ("$name's score is $score")
    }

    open fun damage(damage: Int) {
        energy -= damage
        if (energy > 0) {
            println ("$name's remaining energy: $energy")
        } else {
            println ("Game Over for $name")
        }
    }

    fun showStats() {
        val title = "$name STATS".toUpperCase()
        repeat(title.length) { print("*") }.also { print ("\n") }
        println (title)
        repeat(title.length) { print("*") }.also { print ("\n") }
        println ("Name: $name")
        println ("Score: $score")
        println ("Weapon: $weapon")
        println ("Energy: $energy")
    }
}

open class Player2(name: String, score: Int, energy: Int, weapon: String)
    : Player1(name, score, energy, weapon) {

    override fun damage(damage: Int) {
        super.damage(damage / 4)
    }

    override fun killEnemy() {
        score += 4
        println ("$name's score: $score")
    }
}

class Player3(name: String, score: Int, energy: Int, weapon: String):
        Player2(name, score, energy, weapon) {

}

fun main() {
    val mario = Player1("Mario", 0, 100, "Pipe")
    mario.killEnemy()
    mario.killEnemy()
    mario.damage(12)
    mario.damage(88)
    mario.showStats()

    val luigi = Player2 ("Luigi", 0, 100, "Mushroom")
    luigi.killEnemy()
    luigi.killEnemy()
    luigi.damage(100)
    luigi.showStats()

    val toad = Player3("Toad", 0, 200, "Rock")
    toad.killEnemy()
    toad.damage(60)
    toad.showStats()
}