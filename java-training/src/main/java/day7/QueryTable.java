package day7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryTable {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addResource("Person.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        List<Person> personList = session.createQuery("from Person",Person.class).getResultList();
        System.out.println(personList);
        session.close();
    }
}
