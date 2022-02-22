package day2;

// aggregation
// multiple instances of an object is associated with a single instance
// of another object
// Many person have only one supervisor
public class Person {
    private Name name;
    private Address address;
    private Person supervisors;
}
