package org.example.spring_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("idPerson", Person.class);
        Person person1 = context.getBean("idPerson", Person.class);
        person.infoPerson();
        context.close();
    }
}
