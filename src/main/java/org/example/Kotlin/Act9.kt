package org.example.Kotlin

class Act9 {
    fun Primo(): String {
        println("Es primo ?")
        val num: Int = readLine()!!.toInt()
        var isPrime = true

        if (num <= 1) {
            isPrime = false
        } else {
            for (i in 2..(num / 2)) {
                if (num % i == 0) {
                    isPrime = false
                    break
                }
            }
        }

        return if (isPrime) {
            ("$num es primo")
        } else {
            ("$num no es primo")
        }
    }
}