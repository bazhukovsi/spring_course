package org.example.spring_example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("idSedan")
public class Sedan implements Car{
    @Value("${car.model}")
    private String model;
    public Sedan() {
        System.out.println("Это конструктор Sedan");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void info() {
        System.out.println("Это седан - " + model + ". Машина для семьи.");
    }
}
