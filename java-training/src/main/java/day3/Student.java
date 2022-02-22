package day3;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(rollNumber,o.getRollNumber());

    }
    // write a compareTo function which sorts the student array by name instead of roll number

}
