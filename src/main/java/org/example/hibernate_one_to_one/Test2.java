package org.example.hibernate_one_to_one;

import org.example.hibernate_one_to_one.entity.Detail;
import org.example.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = new Employee("Elena1", "Bazhukova1", "Sales", 1100);
            Detail detail = new Detail("Segezha1", "91140289161111","ya_bazhukov1a@yandex.ru");
            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            session.save(detail);
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
}

