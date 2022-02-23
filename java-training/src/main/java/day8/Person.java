package day8;

public class Person {
    private int id;
    private String name;
    private PhoneNumber number;

    public Person(int id, String name, PhoneNumber number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Person() {
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
