package com.atuka;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static int MONTHS_IN_YEAR = 12;
    final static int PERCENTAGE = 100;

    public static void main(String[] args) {
        final int MIN_PRINCIPAL = 1_000;
        final int MAX_PRINCIPAL = 1_000_000;
        final int MIN_YEAR = 1;
        final int MAX_YEAR = 30;
        final int MIN_ANNUAL_RATE = 0;
        final int MAX_ANNUAL_RATE = 30;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the following Values");
        int principal = (int) readValue("Principal ($1K-$1M) ",
                MIN_PRINCIPAL, MAX_PRINCIPAL);
        float annualRate = (float) readValue("Annual Interest Rate ",
                MIN_ANNUAL_RATE, MAX_ANNUAL_RATE);
        byte years = (byte) readValue("Period (Years) ", MIN_YEAR, MAX_YEAR);

        printMortgage(principal, annualRate, years);
        printPaymentSchedule(years, principal, annualRate);

    }

    private static void printMortgage(int principal, float annualRate, byte years) {
        double mortgage = calculateMortgage(principal, annualRate, years);
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage ");
        System.out.println("-------------------");
        System.out.println("Monthly Payment: " + mortgageFormated);
    }

    private static void printPaymentSchedule(byte years, int principal, float annualRate) {
        System.out.println("Payment Schedule Heading");
        System.out.println("-------------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculatePaymentSchedule(principal, annualRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double calculateMortgage(int principal, float annualInterest,
                                           byte years) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENTAGE = 100;
        float monthlyInterestRate = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;
        int numberOfPayments = MONTHS_IN_YEAR * years;
        return principal * monthlyInterestRate *
                Math.pow(1 + monthlyInterestRate, numberOfPayments) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public static double calculatePaymentSchedule(int principal, float annualInterest, byte years, short numberOfPaymentMade) {
        float monthlyInterestRate = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;
        int numberOfPayments = MONTHS_IN_YEAR * years;
    
        return principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentMade)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public static double readValue(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.printf(prompt + ":-");
            value = scanner.nextFloat();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println();
            System.out.print("Enter Value Between " + min + " and " + max + ":");
        }
        return value;
    }
}