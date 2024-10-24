package org.example.Java;

import java.util.Scanner;

public class Act11 {
    Scanner scanner = new Scanner(System.in);
    public void Fibonachi() {
        System.out.println("Dime  los primeros N números de la secuencia de Fibonacci ?");
        int numbre = scanner.nextInt();
        int fibonacci = 0;
        int num1 = 0;
        int num2 = 1;

        for(var i=1;i<numbre+1;++i)
        {
            fibonacci=num1+num2;
            System.out.print(" "+fibonacci);
            num1=num2;
            num2=fibonacci;
        }

    }
}
