package com.atuka.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void show() {
        sayHello(null);
    }
public  static void deposit(float value) throws IOException{
        if (value<0)
            throw new IOException();
}
    public static void sayHello(String name) {
        try (var reader = new FileReader("this.txt")) {
            var value = reader.read();
            System.out.println("Hello" + name.toUpperCase());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
