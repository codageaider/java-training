package day14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private String id;
    // Field Injection
//    @Autowired
    private Address address;

    @Autowired // Constructor Injection
    public Person(Address address) {
        name = "name-2";
        id = "id-2";
        System.out.println("Inside Person address constructor");
        this.address = address;
    }

    public Person() {
        name = "name-1";
        id = "id-1";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    //    @Autowired Setter Injection
    public void setAddress(Address address) {
        System.out.println("Setter for Person getting called");
        this.address = address;
    }
}
