package com.atuka;

public class MainClass {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        textBox1.setText("Value reflected to the textBox1 object");
        System.out.println(textBox1.text.toUpperCase());
        //Procedural oriented example
        int basicSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;
        int value = calculateWage(basicSalary, extraHours, hourlyRate);
        System.out.println(value);
    }

    public static int calculateWage(int basicSalary, int extraHours, int hourlyRate) {
        return basicSalary + (extraHours * hourlyRate);
    }
}
