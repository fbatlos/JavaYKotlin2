package org.example.Java;

import java.util.Scanner;

public class Act10 {
    Scanner scanner = new Scanner(System.in);
    public String Temperatura() {
        System.out.println("Que quieres F o C ?");
        String option = scanner.nextLine();

        if (option.equals("F")) {
            System.out.println("Cuantos Celsius vas a tranformar?");
            Double Celsius = Double.parseDouble(scanner.nextLine());

            Double fahrenheit = Celsius * 1.8 + 32;

            return fahrenheit.toString();
        }else if (option.equals("C")) {
            System.out.println("Cuantos Fahrenheits vas a tranformar?");
            Double Fahrenheit = Double.parseDouble(scanner.nextLine());
            Double celsius = (Fahrenheit - 32)*(5/9);

            return celsius.toString();
        }
        return "no es una opcion";
    }
}
