package org.example.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Act8 {
    Scanner scanner = new Scanner(System.in);
    public Map<String, Integer> ContarVocal() {
        System.out.println("Dame una palabra ?");
        String palabra =  scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < palabra.length(); i++) {

            switch (palabra.charAt(i)) {
                case 'a':
                    map.compute("a", (key, val) -> val == null ? 1 : val + 1);
                    break;
                case 'e':
                    map.compute("e", (key, val) -> val == null ? 1 : val + 1);
                    break;
                case 'i':
                    map.compute("i", (key, val) -> val == null ? 1 : val + 1);
                    break;
                case 'o':
                    map.compute("o", (key, val) -> val == null ? 1 : val + 1);
                    break;
                case 'u':
                    map.compute("u", (key, val) -> val == null ? 1 : val + 1);
                    break;
                    default:
            }
        }
        return map;
    }
}
