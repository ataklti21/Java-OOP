package com.atuka.InterfacePractice;

public class TaxReport {
    private TaxCalculator taxCalculator;

//    public TaxReport(TaxCalculator taxCalculator) {
//        this.taxCalculator = taxCalculator;
//    }

    public void show(TaxCalculator taxCalculator) {
        System.out.println(taxCalculator.calculateTax());
    }

    public void show(double percentage) {
        System.out.println(taxCalculator.calculateTax(percentage));
    }

//    public void setTaxCalculator(TaxCalculator taxCalculator) {
//        this.taxCalculator = taxCalculator;
//    }
}
