package day2.association;

public class driverProgram {
    public static void main(String[] args) {
        Student student1 = new Student("name-1");
        Student student2 = new Student("name-2");
        Student student3 = new Student("name-3");
        Student student4 = new Student("name-4");
        Student student5 = new Student("name-5");
        Student student6 = new Student("name-6");
        Course course = new Course();

        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        course.addStudent(student5);
        course.addStudent(student6);

        course.print();
        // course.addStudent


    }
}
