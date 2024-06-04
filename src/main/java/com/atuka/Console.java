package com.atuka;

import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static double readValue(String prompt) {
        return scanner.nextDouble();
    }

    public static double readValue(String prompt, int min, int max) {

        double value;
        while (true) {
            System.out.printf(prompt + ":-");
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println();
            System.out.print("Enter Value Between " + min + " and " + max + ":");
        }
        return value;
    }
}
