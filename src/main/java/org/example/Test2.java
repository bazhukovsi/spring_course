package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
        System.out.println("----------------------------");
        Car car = context.getBean("idCar", Sedan.class);
        Person person = context.getBean("idPerson", Person.class);
        car.info();
        person.infoPerson();
        context.close();
    }
}
