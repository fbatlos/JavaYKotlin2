package org.example.Kotlin

import kotlin.math.pow

class Act3 {
    fun Area(): String {
        println("De cuanto es tu radio ?")
        val radio: Double = readLine()!!.toDouble()
        val area = Math.PI * radio.pow(2.0)
        return "El area del circulo sería :  $area"
    }
}