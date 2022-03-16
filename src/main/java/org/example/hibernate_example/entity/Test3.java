package org.example.hibernate_example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Car car = session.get(Car.class, 5);
            car.setPrice(28000);
            session.createQuery("update Car set price = 22000 where brand = 'KIA'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
}
