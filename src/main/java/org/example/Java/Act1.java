package org.example.Java;

import java.util.Scanner;

public class Act1 {
    Scanner scanner = new Scanner(System.in);
    public String Saludo() {
        System.out.println("Cual es tu nombre?");
        String nombre = scanner.nextLine();
        return "¡Hola , "+nombre+"!";
    }
}
