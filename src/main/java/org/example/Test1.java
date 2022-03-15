package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("-----------------------------------");
        Car sedan = context.getBean("idSedan", Sedan.class);
        Car track = context.getBean("idTrack", Track.class);
        Person person = context.getBean("idPerson", Person.class);
        sedan.info();
        track.info();
        person.infoPerson();
        context.close();
    }
}
