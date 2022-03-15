package org.example;

public class Sedan implements Car{
    public Sedan() {
        System.out.println("Это конструктор Sedan");
    }

    @Override
    public void info() {
        System.out.println("Это седан. Машина для семьи.");
    }
}
