package day8;
/*
(i) Create a new class Student(id,name,rollno,university) and insert some entries into it using
the increment generator. (4-5)
(ii) write a separate statement to Query all the records in the Student table and fetch them in a list.
and print out the result.
(iii) write your own CustomIdGenerator which generates a random 5 digit number

(iv) create a new class Car with the following properties:
Integer id, Double speed, String name, Float horsePower, Character maker,
Boolean isHatchBack, Long carNumber
I have included all the primitive data types/wrapper

(v) Create a Student class
Integer id;
List<Integer> marks;
There is direct mapping available between a List and any table column
example marks = [10, 20, 30]
Store it as a comma separated string in the table.
new Student(10,Arrays.asList(10,20,30))
In the Student table there should be 2 colmsn id and marks
id-> int
marks-> varchar
you need to convert the List<Integer> to a String
String s = "10, 20,30" and store this string in the table instead of the List<Integer>
setMarks and getMarks <-- modify these two methods
setMarks(String marks)  <-- convert String to a list of integer
String getMarks() -> convert the list to String

 */
/*
Note:
*) If you want to give wrapper classes instead of the primitive data types
 you need to provide the fully qualified class name.
 Like for Integer you should specify - java.lang.Integer

 


 */
public class Main {
}
