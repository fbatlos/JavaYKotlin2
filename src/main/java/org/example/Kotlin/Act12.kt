package org.example.Kotlin

class Act12 {
    fun CadenaAlrevesNum(): Int {
        println("Numero ?")
        val cadena: Int = readLine()!!.toInt()
        val cadenaTexto = cadena.toString()
        var cadenaAlreves = cadenaTexto.reversed()

        val cadenaAlrevesNum = cadenaAlreves.toInt()
        return cadenaAlrevesNum
    }
}