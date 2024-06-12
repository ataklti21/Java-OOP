package com.atuka.collections;

public class Main {

    public static void main(String[] args) {
        final int MIN_PRINCIPAL = 1_000;
        final int MAX_PRINCIPAL = 1_000_000;
        final int MIN_YEAR = 1;
        final int MAX_YEAR = 30;
        final int MIN_ANNUAL_RATE = 0;
        final int MAX_ANNUAL_RATE = 30;

       // Console.readValue("Enter The number");
        System.out.println("Please Enter the following Values");
        int principal = (int) Console.readValue("Principal ($1K-$1M) ", MIN_PRINCIPAL, MAX_PRINCIPAL);
        float annualRate = (float) Console.readValue("Annual Interest Rate ", MIN_ANNUAL_RATE, MAX_ANNUAL_RATE);
        byte years = (byte) Console.readValue("Period (Years) ", MIN_YEAR, MAX_YEAR);

        MortgageCalculator calculator =
                new MortgageCalculator(principal, annualRate, years);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }

}