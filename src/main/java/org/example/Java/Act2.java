package org.example.Java;

import java.util.Scanner;

public class Act2 {
    Scanner scanner = new Scanner(System.in);
    public String ParOImpar() {
        System.out.println("Cual es tu numero?");
        int num = Integer.parseInt(scanner.nextLine());

        if (num % 2 == 0) {
            return "Par";
        }else {
            return "Impar";
        }
    }
}
