package org.example.Kotlin

class Act11 {
    fun Fibonachi() {
        println("Dime  los primeros N números de la secuencia de Fibonacci ?")
        val numbre: Int = readLine()!!.toInt()
        var fibonacci = 0
        var num1 = 0
        var num2 = 1

        for (i in 1 until numbre + 1) {
            fibonacci = num1 + num2
            print(" $fibonacci")
            num1 = num2
            num2 = fibonacci
        }
    }
}