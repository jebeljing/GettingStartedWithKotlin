package com.rsk

 interface Signatory {
     fun sign()
 }

open class Person (val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {
    var partnerName: String = ""

//    var isMarried = false
//    constructor(name: String, age: Int, isMarried: Boolean): this(name, age) {
//        this.isMarried = isMarried
//    }
//    init {
//        if (name == "Kevin" && age < 54) throw Exception("Invalid age")
//    }

    override fun sign() = println("$name aged $age can sign documents (and their marital status is $isMarried)")

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person("Kevin", 28, true)
            p.sign()

            p.age = 54;
            p.sign()

            p.partnerName = "Alice"
            println("Partner name is ${p.partnerName}")

            p.partnerName = "Bob"
            println("Partner name is ${p.partnerName}")
        }
    }
}

class Student(name: String, age:Int) : Person(name, age)

data class User(val name: String, val id: Int)

fun main(args: Array<String>) {
    val p = Person("Kevin", 28, true)
    p.sign()

    p.age = 54;
    p.sign()

    val kevin = User("Kevin", 2)
    println(kevin)
    val (name, id) = kevin

    val otheruser = kevin.copy(id = 3)

    println("User is $name and their id $id")
    println(otheruser)
}