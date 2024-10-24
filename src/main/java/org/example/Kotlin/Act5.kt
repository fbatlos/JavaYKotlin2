package org.example.Kotlin

class Act5 {
    fun TablaMultiplicar() {
        println("Cual es tu numero ? ")
        val number: Int = readLine()!!.toInt()

        for (i in 1..10) {
            println(number.toString() + " x " + i + " = " + (number * i))
        }
    }
}