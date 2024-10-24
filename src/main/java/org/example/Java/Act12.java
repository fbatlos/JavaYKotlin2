package org.example.Java;

import java.util.Scanner;

public class Act12 {

    Scanner scanner = new Scanner(System.in);
    public int CadenaAlrevesNum() {
        System.out.println("Numero ?");
        int cadena = scanner.nextInt();
        String cadenaTexto = String.valueOf(cadena);
        String cadenaAlreves = "";


        for (int i = 0; i < cadenaTexto.length(); i++) {
            cadenaAlreves = cadenaTexto.charAt(i)+cadenaAlreves;
        }

        int cadenaAlrevesNum = Integer.parseInt(cadenaAlreves);
        return cadenaAlrevesNum;

    }
}
