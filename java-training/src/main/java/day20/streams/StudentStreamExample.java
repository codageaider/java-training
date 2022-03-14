package starter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStreamExample {
    public static void main(String[] args) {
        Student student1 = new Student("name-1", Arrays.asList(new Course("course-1", 1),
                new Course("course-2", 2)));
        Student student2 = new Student("name-2", Arrays.asList(new Course("course-1", 3),
                new Course("course-2", 4)));

        List<Student> studentList = Arrays.asList(student1, student2);
        Stream<Integer> stream = studentList.stream().map(s -> s.getCourseList())
                .map(cl -> cl.stream().mapToInt(c -> c.getMarks()).sum());
        Stream<Integer> stream2 = studentList.stream().map(s -> s.getCourseList())
                .map(cl -> cl.stream().mapToInt(c -> c.getMarks()).sum());
        System.out.println("Total marks of each students = " + stream.
                collect(Collectors.toList()));
        System.out.println("Total marks of all students = " +
                stream2.mapToInt(Integer::intValue).sum());

    }
}
