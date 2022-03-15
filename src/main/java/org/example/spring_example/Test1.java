package org.example.spring_example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("-----------------------------------");
        Person person = context.getBean("idPerson", Person.class);
        Person person1 = context.getBean("idPerson", Person.class);
        System.out.println(person == person1);
        person.infoPerson();
        context.close();
    }
}
