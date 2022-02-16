package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        // wrapper classes Integer, Double
        List<Integer> list = new ArrayList<>();
        // write a function that takes list of integer
        // as an argument and return the sum of all the numbers
        // in the list
        // Exception handling to deal with exceptional situations
        //and continu the normal execution.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
            int result = number1 / number2;
            System.out.println("The result of division is =" + result);
        } catch (ArithmeticException ex){
            System.out.println("cannot divide by zero");
        }
        System.out.println("reached the end");
    }
}
