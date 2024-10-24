package org.example.Kotlin

import java.util.*

class Act2 {

    fun ParOImpar(): String {
        println("Cual es tu numero?")
        val num = readLine()?.toInt()

        return if (num!! % 2 == 0) {
            "Par"
        } else {
            "Impar"
        }
    }
}