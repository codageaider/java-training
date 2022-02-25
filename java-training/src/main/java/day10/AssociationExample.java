package day10;

import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.Utility;
/*
Table person with id =1 and 2 phone numbers
(i) delete a person record with person id = 1
Table person with id =1 and 2 phone numbers
(ii) change the cascade type to persist
    and try deleting a person record with person id = 1

Message me your findings and what is the difference in behavior in (i)
and (ii)

 */
public class AssociationExample {
    public static void main(String[] args) {
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        person.setName("name-2");
        session.persist(person);
        transaction.commit();
        session.close();
    }

    private static void insertNewPhoneNumber() {
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Person person = session.get(Person.class,1);
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber("999999");
        phoneNumber.setProvider("jio");
        phoneNumber.setPerson(person);

        session.persist(phoneNumber);
        transaction.commit();
        session.close();
    }

    private static void insertInitial() {
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        PhoneNumber phoneNumber = new PhoneNumber();
        Person person= new Person();
        person.setName("name-1");
        phoneNumber.setNumber("1234");
        phoneNumber.setProvider("airtel");
        phoneNumber.setPerson(person);

        session.persist(phoneNumber);
        transaction.commit();
        session.close();
    }
}
