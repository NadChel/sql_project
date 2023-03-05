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
            Employee me = new Employee("Sergey", "Zolotaryov",
                    "Fancy Stuff Department", 200_000);
            session.beginTransaction();
            session.save(me);
            session.getTransaction().commit();
        }
    }
}
