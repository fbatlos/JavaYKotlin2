package org.example.Java;

import java.util.Scanner;

public class Act5 {
    Scanner scanner = new Scanner(System.in);
    public void TablaMultiplicar() {
        System.out.println("Cual es tu numero ? ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
