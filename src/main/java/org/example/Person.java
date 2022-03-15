package org.example;

public class Person {
    Car car;

    public Person() {
        System.out.println("Это конструктор Person");
    }

    public Person(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void infoPerson() {
        System.out.println("Метод infoPerson класса Person");
    }
}
