package org.example.hibernate_example;

import org.example.hibernate_example.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test8 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);
            session.createQuery("delete Employee where name = 'Masha'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
}
