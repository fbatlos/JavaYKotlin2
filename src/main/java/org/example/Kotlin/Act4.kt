package org.example.Kotlin

import java.util.*

class Act4 {
    fun NumAleatorio(): String {
        var win = false
        val Aleatorio = Random()
        val numberWin = Aleatorio.nextInt(100) + 1

        while (!win) {
            println("Dime un numero del 1 al 100 ")
            val num: Int = readLine()!!.toInt()
            if (num > numberWin) {
                println("Mi numero es mas bajo ....")
            } else if (num < numberWin) {
                println("Mi numero es mas alto ....")
            }
            if (num == numberWin) {
                win = true
            }
        }
        return "Has ganado !!!!!!!!!!!!"
    }
}