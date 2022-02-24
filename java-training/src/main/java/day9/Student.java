package day9;

import jakarta.persistence.*;

@Entity
@Table(name="student_records")
public class Student {
    @Id
    @GeneratedValue
    @Column(name="student_id")
    private int id;
    @Column(name="student_name")
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
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

}
