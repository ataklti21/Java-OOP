package com.atuka.InterfacePractice;

import com.atuka.exceptions.ExceptionDemo;

import java.io.IOException;

public class MainInterfaceClass {
    public static void main(String[] args) {
        //poor man dependency injection
        var taxCalculator2018 = new TaxCalculator2018(10_000);
        var report = new TaxReport();
        report.show(10);
        report.show(taxCalculator2018);
        var taxCalculator2019= new TaxCalculator2019(20_000);
        var report2019 = new TaxReport();
        report2019.show(taxCalculator2019);
        report2019.show(20);
        try {
            ExceptionDemo.deposit(0.1F);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
