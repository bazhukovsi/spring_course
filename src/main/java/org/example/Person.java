package org.example;

public class Person {
    Car car;
    private String name;

    public Person() {
        System.out.println("Это конструктор Person");
    }

    public Person(Car car) {
        System.out.println("Это конструктор Person с параметром Car");
        this.car = car;
    }

    public void setCar(Car car) {
        System.out.println("Это сеттер класса Car в классе Person");
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void infoPerson() {
        System.out.println("Метод infoPerson класса Person");
        System.out.println("Имя владельца машины - " + this.name);
        car.info();
    }
}
