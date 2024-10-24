package org.example.Java;

import java.util.Random;
import java.util.Scanner;

public class Act4 {
    Scanner scanner = new Scanner(System.in);
    public String NumAleatorio() {
        boolean win = false;
        Random Aleatorio = new  Random();
        int numberWin = Aleatorio.nextInt(100)+1;

        while (!win) {

            System.out.println("Dime un numero del 1 al 100 ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num > numberWin) {
                System.out.println("Mi numero es mas bajo ....");
            } else if (num < numberWin) {
                System.out.println("Mi numero es mas alto ....");
            }
            if (num == numberWin) {
                win = true;
            }

        }
        return "Has ganado !!!!!!!!!!!!";

    }
}
