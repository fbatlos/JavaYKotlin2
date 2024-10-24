package org.example.Java;

import java.util.Scanner;

public class Act7 {
    Scanner scanner = new Scanner(System.in);
    public String CadenaAlreves() {
        System.out.println("Palabra ?");
        String cadena = scanner.nextLine();
        String cadenaAlreves = "";


        for (int i = 0; i < cadena.length(); i++) {
            cadenaAlreves = cadena.charAt(i)+cadenaAlreves;
        }

        return cadenaAlreves;

    }
}
