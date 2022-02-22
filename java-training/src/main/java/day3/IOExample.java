package day3;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

/*
File class
 */
public class IOExample {
    public IOExample() throws IOException {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("test.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());

        File file2 = new File("test2.txt");
        // try with resources
        // Autocloseable
        try (PrintWriter printWriter = new PrintWriter(file2);) {
            printWriter.println("This is a code created file");
            printWriter.println("This is the second line");
        }

        try (Scanner scanner = new Scanner(file2);) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
        URL url = new URL("http://www.google.com/");
        Scanner input = new Scanner(url.openStream());
        while (input.hasNext()) {
            System.out.println(input.nextLine());
        }
        /*
        read an expression from a file and output it's result
         */

        /*
        reading and writing text to and from files or from console from user input
        Object I/O you can read and write objects to a file
         */
//        ObjectInputStream objectInputStream;
//        ObjectOutputStream objectOutputStream;
        //Wed Feb 16 12:42:23 IST 2022
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.data"));) {
//            objectOutputStream.writeUTF("This is from object output stream");
//            objectOutputStream.writeObject(new Date());
//        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.data"));) {
            String sentence = objectInputStream.readUTF();
            Date date = (Date) objectInputStream.readObject();
            System.out.println("------------------");
            System.out.println(sentence);
            System.out.println(date);

        }
//        int[] numbers = {1,2,3,4,5};
//        String[] strings = {"string-1","string-2","string-3"};
//        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("array.dat"));){
//            objectOutputStream.writeObject(numbers);
//            objectOutputStream.writeObject(strings);
//        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("array.dat"));) {
            int[] numbers2 = (int[]) objectInputStream.readObject();
            String[] strings2 = (String[]) objectInputStream.readObject();
            for (int number : numbers2)
                System.out.println(number);
            for (String str : strings2)
                System.out.println(str);

        }

//        Student student = new Student("random", 1);
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.dat"));) {
//            objectOutputStream.writeObject(student);
//        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.dat"));) {

            Student student= (Student) objectInputStream.readObject();
            System.out.println(student.getName() + " , "+student.getRollNumber());


        }
        // fibonacci series?
        // fib(1) = 1 fib(2) = 1 fib(3) = 2 , fib(4)=3
        // fib(n) = fib(n-1) + fib(n-2)
        //  write a code for computing the nth fibonacci number
        // iteratively and recursively both

        //Q2: int sum(int number) and returns the sum of it's digit
    }
}
