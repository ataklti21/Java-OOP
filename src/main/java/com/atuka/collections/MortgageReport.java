package com.atuka.collections;

import java.text.NumberFormat;

public class MortgageReport {

    public static final NumberFormat CURRENCY_INSTANCE = NumberFormat.getCurrencyInstance();
    private final MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        System.out.println("Payment Schedule Heading");
        System.out.println("-------------------");
        for (double balance : calculator.getRemainingBalance()) {
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }

    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormated = CURRENCY_INSTANCE.format(mortgage);
        System.out.println("Mortgage ");
        System.out.println("-------------------");
        System.out.println("Monthly Payment: " + mortgageFormated);
    }
}
