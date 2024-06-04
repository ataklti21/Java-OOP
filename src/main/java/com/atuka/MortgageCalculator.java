package com.atuka;

public class MortgageCalculator {
    final static int MONTHS_IN_YEAR = 12;
    final static int PERCENTAGE = 100;

    private int principal;
    private float annualInterest;
    private short years;


    public MortgageCalculator(int principal, float annualInterest, short years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculatePaymentSchedule(short numberOfPaymentMade) {
        float monthlyInterestRate = getMonthlyInterestRate();
        int numberOfPayments = getNumberOfPayments();

        return principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentMade)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    private int getNumberOfPayments() {
        return MONTHS_IN_YEAR * years;
    }

    private float getMonthlyInterestRate() {
        return annualInterest / PERCENTAGE / MONTHS_IN_YEAR;
    }

    public double calculateMortgage() {
        float monthlyInterestRate = getMonthlyInterestRate();
        int numberOfPayments = getNumberOfPayments();
        return principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public short getYears() {
        return years;
    }
}
