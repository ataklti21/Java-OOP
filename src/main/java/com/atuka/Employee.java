package com.atuka;

public record Employee(int basicSalary, int hourlyRate) {
    public static int numberOfEmployee;

    public Employee {
        if (basicSalary < 0) {
            throw new IllegalArgumentException("Base salary should not be zero or less");
        }
        numberOfEmployee++;
    }

    public Employee(int hourlyRate) {
        this(0, hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return basicSalary + (hourlyRate * extraHours);
    }

    public int calculateWage() {
        return calculateWage(0);
    }

}
