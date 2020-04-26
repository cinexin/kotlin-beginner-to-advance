package org.courses.kotlin.ooo

open class Person {
    open fun myInfo(name: String, age: Int, qualification: String) {
        println ("\nName: $name. \nAge: $age. \nQualification: $qualification")
    }

}

class Teacher: Person() {
    override fun myInfo(name: String, age: Int, qualification: String) {
        super.myInfo(name, age, qualification.plus(" / Teacher"))
    }
}

class Student: Person() {
    override fun myInfo(name: String, age: Int, qualification: String) {
        super.myInfo(name, age, qualification.plus(" / Student"))
    }
}

fun main() {
    val person = Person()
    val persons = Array<Person>(2) { person }
    persons[0] = Teacher()
    persons[1] = Student()

    persons[0].myInfo("Teacher", 23, "PhD")
    persons[1].myInfo("Student", 12, "Matriculation")
}