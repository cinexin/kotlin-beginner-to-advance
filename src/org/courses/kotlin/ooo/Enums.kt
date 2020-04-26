package org.courses.kotlin.ooo

import java.math.BigDecimal
import java.util.ArrayList

enum class Brand {
    Toyota,
    Ford,
    Seat,
    Peugeot
}
class Vehicle {
    var name: String = ""
    var brand: Brand = Brand.Ford
    var model: Int = 0
    var price: BigDecimal = BigDecimal(12000)

    constructor(name: String, brand: Brand, model: Int, price: BigDecimal) {
        this.name = name
        this.brand = brand
        this.model = model
        this.price = price
    }

    override fun toString() = "${this.name} - ${this.brand} - ${this.model}"
}

class Garage {
    var vehicles: ArrayList<Vehicle> = arrayListOf()

    fun enterVehicle(name: String, brand: Brand, model: Int, price: BigDecimal) {
        val newVehicle = Vehicle(name, brand, model, price)
        vehicles.add(newVehicle)
        println("${newVehicle.name} has entered the garage")
    }

    fun fetchVehicle(at: Int) {
        val vehicle = vehicles.removeAt(at)
        println("${vehicle.name} has left the garage")
    }

    fun show() {
        val title = "Take a look at my garage...."
        println(title).also { vehicles.forEach { it -> println(it) } }
    }
}

fun main() {
    val myGarage = Garage()
    myGarage.enterVehicle("My Peugeot", Brand.Peugeot, 206, BigDecimal(10000))
    myGarage.enterVehicle("My Seat", Brand.Seat, 167, BigDecimal(9000))
    myGarage.enterVehicle("My Ford", Brand.Ford, 1987, BigDecimal(1000))
    myGarage.enterVehicle("My Toyota", Brand.Toyota, 1923, BigDecimal(50000))

    myGarage.show()

    myGarage.fetchVehicle(0)
    myGarage.show()
}