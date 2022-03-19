package org.example.hibernate_example;

import org.example.hibernate_example.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Car car = session.get(Car.class, 1);
            session.delete(car);
            session.createQuery("delete Car where brand = 'VW'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
}
