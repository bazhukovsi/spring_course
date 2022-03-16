package org.example.hibernate_example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            Employee emp = new Employee("Sasha", "Bazhukova", "Medicine", 1000);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            int myId = emp.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee myEmp = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(myEmp);

        } finally {
            factory.close();
            session.close();
        }
    }
}
