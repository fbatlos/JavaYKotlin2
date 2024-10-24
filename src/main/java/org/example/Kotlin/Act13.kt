package org.example.Kotlin

class Anime(var nombre: String, var episodio: Int, var genero: String){
    override fun toString(): String {
        return "El anime es : $nombre en el episodio $episodio y de genero $genero"
    }
}