package org.example.hibernate_example;

import org.example.hibernate_example.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Car car = new Car("KIA", "Sportage", "Koreya", 25000);

            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();

        } finally {
            factory.close();
            session.close();
        }
    }
}
