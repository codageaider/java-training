package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*
File class
 */
public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());

        File file2 = new File("test2.txt");
        // try with resources
        // Autocloseable
        try(PrintWriter printWriter = new PrintWriter(file2);) {
            printWriter.println("This is a code created file");
            printWriter.println("This is the second line");
        }

        try(Scanner scanner = new Scanner(file2);) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
        URL url  = new URL("http://www.google.com/");
        Scanner input = new Scanner(url.openStream());
        while(input.hasNext()){
            System.out.println(input.nextLine());
        }
        /*
        read an expression from a file and output it's result
         */

    }
}
