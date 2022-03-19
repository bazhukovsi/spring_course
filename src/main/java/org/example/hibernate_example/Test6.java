package org.example.hibernate_example;

import org.example.hibernate_example.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employees = session.createQuery
                    ("from Employee where salary > 700 and name = 'Sasha'").getResultList();
            session.getTransaction().commit();
            for (Employee employee :
                    employees) {
                System.out.println(employee);
            }
        } finally {
            factory.close();
            session.close();
        }
    }
}
