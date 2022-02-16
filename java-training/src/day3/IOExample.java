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
        try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("object.data"));){
            String sentence = objectInputStream.readUTF();
            Date date= (Date) objectInputStream.readObject();
            System.out.println("------------------");
            System.out.println(sentence);
            System.out.println(date);

        }
    }
}
