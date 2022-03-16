package org.example.hibernate_example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test7 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
//            employee.setSalary(1200);
            session.createQuery("update Employee set salary = 1300 where name = 'Masha'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
}
