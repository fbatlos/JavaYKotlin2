package org.example;

import org.example.Java.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VideoJuegos videoJuego1 = new VideoJuegos("LOL","PC",1233);
        VideoJuegos videoJuego2 = new VideoJuegos("LOL2","Xbox",312);

        InventarioJuegos inventarioJuegos = new InventarioJuegos();

        System.out.println(inventarioJuegos.addVideoJuego(videoJuego1));
        System.out.println(inventarioJuegos.addVideoJuego(videoJuego2));
        inventarioJuegos.showVideoJuegos();
        System.out.println(inventarioJuegos.removeVideoJuego(videoJuego1));
        inventarioJuegos.showVideoJuegos();



    }





}


