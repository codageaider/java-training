package day8;

public class Person {
    private int id;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    private String personId;
    private String name;
    private PhoneNumber number;



    public Person() {
    }

    public Person(int id, String personId, String name, PhoneNumber number) {
        this.id = id;
        this.personId = personId;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneNumber getNumber() {
        return number;
    }

    public void setNumber(PhoneNumber number) {
        this.number = number;
    }
}
