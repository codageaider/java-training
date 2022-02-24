package day8;

/*
relations
one to one
one to many
many to one
many to many

RDBMS -> relatinal database management system
or these relations exists between different entities in the database.

primary key = id
foreign key = song_details_id
song table -> (id, name, lyricist, song_details_id int)
song_details -> (id, musical_instrument, release_date, producer, director,...)

song table   (1,"name-1", "lyr-1", 2)
song_details (2, "guitar", 2020, "produc-1","director-1")

One row in the table song and look for how many rows are related to this
row in table song_details --->  one - to - one  [one object maps to exactly one object in other table]


(ii)
one-to-many
Person has many phone numbers
person table and a phone_number table.

(iii)
many-to-one
phone_number -> person is many to one

(iv)
many to many
customers table and there is a product table
now a customer can purchase multiple products
and each product can be purchased by multiple customers.


 */

import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.Utility;

/*
1) Person table
2) PhoneNumber table

Many to one
many phone numbers getmapped to a single  person
(i) many to one on the Person class
(ii) modifed the table so that we could store multiple phone
numbers for a person
(iii) many to one mapping on the phone number class.

Q:
Department
employee

many employee will be in the same department.

(i)Try writing this Department class and employee class.
(ii) define the mapping in the mapping file
(iii) create a new record
(iv) Add multiple employees to the same department

 */
public class AssociationExample {
    public static void main(String[] args) {
        Session session = Utility.getSession("association.hbm.xml");
        Transaction transaction = session.beginTransaction();
        Person person= session.get(Person.class,1);
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setPerson(person);
        phoneNumber.setNumber("99999");
        session.persist(phoneNumber);
        transaction.commit();
        session.close();

    }


    private static void addPersonAndPhoneNumber() {
        Session session = Utility.getSession("association.hbm.xml");
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        person.setName("name");
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber("12345678");
        phoneNumber.setPerson(person);

        session.persist(phoneNumber);
        transaction.commit();
    }
}
