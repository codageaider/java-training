package day9;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
/*
annotations are meta data information
Notes or comments on what this class is about
WE can either use annotations or xml for persistence

Unless you mark a class to be processed by hibernate it won't process it.
hibernate is ORM it's about mapping classes to tables
annotations ->
 (i) annotation name
 (ii) annotation property
 property defines the same annotation, think of it as a modifier.
 */
@Entity
@Table(name="student_records")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
