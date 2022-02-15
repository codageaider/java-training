package day2.association_using_list;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Student> students;
    private Faculty faculty;
    private int index;

    Course() {
        index = 0;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
       students.add(student);
    }

    // setters
    public void setFaculty(Faculty _faculty) {
        faculty = _faculty;
    }

    // getter
    public Faculty getFaculty() {
        return faculty;
    }

    public void print() {
        System.out.println("List of all students int the course");
        System.out.println(students);
    }
}
