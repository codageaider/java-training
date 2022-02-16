package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
File class
 */
public class FileExample {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());

        File file2 = new File("test2.txt");
        PrintWriter printWriter = new PrintWriter(file2);
        printWriter.println("This is a code created file");
        printWriter.println("This is the second line");

        printWriter.close();


    }
}
