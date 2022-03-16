package org.example.hibernate_example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            Car car = new Car("VW", "Tiguan", "Germany", 25000);
            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            int myId = car.getId();
            Car myCar = session.get(Car.class, 10);
            session.getTransaction().commit();
            System.out.println(myCar);

        } finally {
            factory.close();
            session.close();
        }
    }
}
