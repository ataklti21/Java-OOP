package com.atuka.InterfacePractice;

public class TaxCalculator2019 implements TaxCalculator{
    private final double taxableIncome;

    public TaxCalculator2019(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome*0.1;
    }

    @Override
    public double calculateTax(double percentage) {
        return taxableIncome*percentage/100;
    }
}
