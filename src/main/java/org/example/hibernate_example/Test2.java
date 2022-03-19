package org.example.hibernate_example;

import org.example.hibernate_example.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            List <Car> cars = session.createQuery("from Car where brand = 'VW' and price > 25000").getResultList();
            for (Car car:cars) {
                System.out.println(car);
            }
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
}
