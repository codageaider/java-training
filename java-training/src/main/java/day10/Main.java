package day10;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(User.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        List<Object[]> objects = session.createNativeQuery("select userID, max(A.totalmessage) as totalMessage from (select userID, count(userID) as totalmessage from users group by userID) as A", Object[].class).getResultList();

        System.out.println(objects);

    }
}
