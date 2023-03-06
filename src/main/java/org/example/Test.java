package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            Employee robotnik = new Employee("Ivo", "Robotnik",
                    "Engineering Department", 1_000_000);
            Employee someoneElse = new Employee("Someone", "Else", "Some Department", 1000);
            session.beginTransaction();
            session.save(robotnik);
            session.save(someoneElse);
            session.getTransaction().commit();
        }
    }
}
