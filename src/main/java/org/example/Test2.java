package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
        System.out.println("----------------------------");
        Person person = context.getBean("idPerson", Person.class);
        Person person1 = context.getBean("idPerson", Person.class);
        System.out.println(person == person1);
        person.infoPerson();
        context.close();
    }
}
