package org.example.Java;

import java.util.Scanner;

public class Act9 {
    Scanner scanner = new Scanner(System.in);

    //Para conocer los números primos del 1 al 100 únicamente necesitamos calcular los múltiplos del 2,3,5 y 7.
    public String Primo() {
        System.out.println("Es primo ?");
        int num = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            return (num + " es primo");
        } else {
            return (num + " no es primo");
        }
    }
}
