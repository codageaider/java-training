package day2.association;
/*
Student, Course, Faculty
Association.
There is an association between the student class and the course class.
There is an association between the course class and student class.
 */
public class Student {
    private Course[] courses;
    private String name;
    Student(String _name){
        name=_name;
    }
    private void addCourse(Course c){

    }
    public String getName(){
        return name;
    }
}
