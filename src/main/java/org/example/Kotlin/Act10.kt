package org.example.Kotlin

class Act10 {
    fun Temperatura(): String {
        println("Que quieres F o C ?")
        val option: String = readLine().toString()

        if (option == "F") {
            println("Cuantos Celsius vas a tranformar?")
            val Celsius: Double = readLine()!!.toDouble()

            val fahrenheit = Celsius * 1.8 + 32

            return fahrenheit.toString()
        } else if (option == "C") {
            println("Cuantos Fahrenheits vas a tranformar?")
            val Fahrenheit: Double = readLine()!!.toDouble()
            val celsius = (Fahrenheit - 32) * (5 / 9)

            return celsius.toString()
        }
        return "no es una opcion"
    }
}