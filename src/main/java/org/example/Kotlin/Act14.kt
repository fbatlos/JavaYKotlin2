package org.example.Kotlin


class VideoJuego(var titulo: String, var plataforma: String, var horasJugadas: Int)

class InventarioJuegos {
    private val videosJuegos: MutableList<VideoJuego> = mutableListOf()

    fun addVideoJuego(videoJuego: VideoJuego): String {
        videosJuegos.add(videoJuego)
        return "Se añadió"
    }

    fun removeVideoJuego(videoJuego: VideoJuego): String {
        videosJuegos.remove(videoJuego)
        return "Se eleminó un juego"
    }

    fun showVideoJuegos() {
        for (videoJuego in videosJuegos) {
            println(videoJuego.titulo + videoJuego.plataforma + "Horas: " + videoJuego.horasJugadas)
        }
    }
}

