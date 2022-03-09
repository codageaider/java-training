package utils;

import day17.Tweet;
import day17.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
    //        public static Session getSession(String hibernateMappingFile){
//            Configuration configuration = new Configuration();
//            configuration.configure();
//            configuration.addResource(hibernateMappingFile);
//            SessionFactory sessionFactory = configuration.buildSessionFactory();
//            Session session = sessionFactory.openSession();
//            return session;
//        }
//    public static Session getSession(){
//        Configuration configuration = new Configuration();
//        configuration.configure();
//        configuration.addAnnotatedClass(Student.class);
//        configuration.addAnnotatedClass(Person.class);
//        configuration.addAnnotatedClass(PhoneNumber.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        return session;
//    }
    public static Session getSession() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Tweet.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }

}
