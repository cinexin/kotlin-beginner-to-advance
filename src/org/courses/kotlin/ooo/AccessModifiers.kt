package org.courses.kotlin.ooo

open class Car {
    var name: String = "xyz"
    private var price = 123
    protected open var model = 208
}

open class Truck: Car() {
    override var model: Int
        get() = super.model + 1000
        set(value) {value + 1000}

    fun printModel() =
        println ("Truck model: $model")

}
fun main() {
    val car = Car()
    println("Car name: ${car.name}")

    val truck = Truck()
    truck.printModel()
}