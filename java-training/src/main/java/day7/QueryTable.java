package day7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
/*

SessionFactory has a field
	private final transient Map<String,Object> properties;

 */
public class QueryTable {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addResource("Person.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        // HQL
        List<Person> personList = session.createQuery("from Person",Person.class).getResultList();
        System.out.println(personList);
        session.close();
    }
    /*
    increment, generator
    And if you don't provide any generator by default it is set to assigned.

     */
}
