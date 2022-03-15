package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("idPerson")
//@Scope("prototype")
public class Person {
//    @Qualifier("idTrack")
//    @Autowired
    Car car;
    @Value("${person.name}")
    private String name;

    public Person() {
        System.out.println("Это конструктор Person");
    }

    @Autowired
    public Person(@Qualifier("idSedan") Car car) {
        System.out.println("Это конструктор Person с параметром Car");
        this.car = car;
    }

//    @Autowired
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
    @PostConstruct
    public void init() {
        System.out.println("Init method класса Person");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method класса Person");
    }

    public void infoPerson() {
        System.out.println("Метод infoPerson класса Person");
        System.out.println("Имя владельца машины - " + this.name);
        car.info();
    }
}
