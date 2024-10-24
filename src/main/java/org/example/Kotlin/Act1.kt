package org.example.Kotlin

import java.util.*

class Act1 {

    fun Saludo(): String {
        println("Cual es tu nombre?")
        val nombre = readLine()
        return "¡Hola , $nombre!"
    }
}