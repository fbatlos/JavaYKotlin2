package org.example.Java;

import java.util.ArrayList;
import java.util.List;

public class InventarioJuegos {
    private List<VideoJuegos> videosJuegos;
    public InventarioJuegos() {
        videosJuegos = new ArrayList<VideoJuegos>();
    }

    public String addVideoJuego(VideoJuegos videoJuego) {
        videosJuegos.add(videoJuego);
        return "Se añadió";
    }

    public String removeVideoJuego (VideoJuegos videoJuego) {
        videosJuegos.remove(videoJuego);
        return "Se eleminó un juego";
    }

    public void showVideoJuegos() {

        for (VideoJuegos videoJuego : videosJuegos) {
            System.out.println(videoJuego.titulo + videoJuego.plataforma + "Horas: "+videoJuego.horasJugadas);
        }

    }

}
