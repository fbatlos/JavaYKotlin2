package org.example.Kotlin

import java.util.HashMap

class Act8 {
    fun ContarVocal(): Map<String, Int> {
        println("Dame una palabra ?")
        val palabra: String = readLine().toString()
        val map: MutableMap<String, Int> = HashMap()

        for (i in 0 until palabra.length) {
            when (palabra[i]) {
                'a' -> map.compute("a") { key: String?, `val`: Int? -> if (`val` == null) 1 else `val` + 1 }
                'e' -> map.compute("e") { key: String?, `val`: Int? -> if (`val` == null) 1 else `val` + 1 }
                'i' -> map.compute("i") { key: String?, `val`: Int? -> if (`val` == null) 1 else `val` + 1 }
                'o' -> map.compute("o") { key: String?, `val`: Int? -> if (`val` == null) 1 else `val` + 1 }
                'u' -> map.compute("u") { key: String?, `val`: Int? -> if (`val` == null) 1 else `val` + 1 }
                else -> {}
            }
        }
        return map
    }
}