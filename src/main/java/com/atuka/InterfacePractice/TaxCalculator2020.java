package com.atuka.InterfacePractice;

public class TaxCalculator2020 implements TaxCalculator {
    private final double taxableIncome;

    public TaxCalculator2020(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome;
    }

    @Override
    public double calculateTax(double percentage) {
        return taxableIncome*percentage/100;
    }
}
