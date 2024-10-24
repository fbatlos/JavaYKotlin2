package org.example.Java;

import java.util.Scanner;

public class Act3 {
    Scanner scanner = new Scanner(System.in);
    public String Area() {
        System.out.println("De cuanto es tu radio ?");
        double radio = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * Math.pow(radio, 2);
        return "El area del circulo sería :  " + area;
    }
}
