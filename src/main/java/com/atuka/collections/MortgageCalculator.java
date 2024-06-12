package com.atuka.collections;

public class MortgageCalculator {
    private final static int MONTHS_IN_YEAR = 12;
    private final static int PERCENTAGE     = 100;

    private final int   principal;
    private final float annualInterest;
    private final short years;


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

    public double[] getRemainingBalance() {
        double[] balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            calculatePaymentSchedule(month);
            balances[month - 1] = calculatePaymentSchedule(month);
            System.out.println(month - 1);
        }
        return balances;
    }


}
