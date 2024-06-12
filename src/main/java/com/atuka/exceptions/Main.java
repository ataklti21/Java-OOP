package com.atuka.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Total sum Number");
            int totalSum = scanner.nextInt();
            System.out.println("Input Total count Number");
            int totalCount = scanner.nextInt();
            printAverage(totalSum, totalCount);
            System.out.println("Exit Main");
        } catch (ArithmeticException e) {

            System.out.println(Arrays.toString(e.getStackTrace()));

        }
    }

private static void printAverage(int totalSum, int totalCount) {
    try {
        int average = computeAverage(totalSum, totalCount);
        System.out.println("Average = " + totalSum + " / " + totalCount + " = " + average);
        System.out.println("Exit Printing average");
    } catch (ArithmeticException e) {
        System.out.println("Error dividing = " + totalSum + " by " + totalCount);
    }

}

private static int computeAverage(int totalSum, int totalCount) {
    System.out.println("Computing Average....");
    try {
        return totalSum / totalCount;
    } catch (ArithmeticException e) {
        System.out.println("Error dividing = " + totalSum + " by " + totalCount);
        System.out.println(Arrays.toString(e.getStackTrace()));
        return 0;
    }

}
}
