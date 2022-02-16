package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
//        // wrapper classes Integer, Double
//        List<Integer> list = new ArrayList<>();
//        // write a function that takes list of integer
//        // as an argument and return the sum of all the numbers
//        // in the list
//        // Exception handling to deal with exceptional situations
//        //and continu the normal execution.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter two integers");
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//        try {
//            int result = number1 / number2;
//            System.out.println("The result of division is =" + result);
//        } catch (ArithmeticException ex) {
//            System.out.println("cannot divide by zero");
//        }
//        System.out.println("reached the end");
//        Double result = division(1, 4);
//        if (result != null) {
//            // proceed with normal execution
//        } else {
//
//        }
        try {
            Double result2 = division3(1.0, 0.0);
            System.out.println("output of division3 = " + result2);
        } catch (MyException ex) {
              // print out more details about the exception
            ex.getDenom();
        }
    }

    // example of overloading
    public static Double division(Double num, Double denom) {
        if (denom == 0) {
            System.out.println("The denom cannot be zero");
            return null;
        }
        return num / denom;
    }

    public static Double division(Integer num, Integer denom) {
        if (denom == 0) {
            System.out.println("The denom cannot be zero");
            return null;
        }
        return Double.valueOf(num) / denom;
    }

    //
    public static Double division2(Double num, Double denom) {
        Double result = null;
        try {
            result = num / denom;
        } catch (ArithmeticException ex) {
            return null;
        }
        return result;
    }

    public static Double division3(Double num, Double denom) throws MyException {
        Double result = null;
        if (denom == 0)
            throw new MyException(num,denom);
        result = num / denom;
        return result;
    }
    /*
    1) RunTimeException , example : ArithmeticException
       We don't need to handle it or provide a throws declaration in the method signature
    2) Other Exceptions requires that you either handle it or declare the exception using the
    throws keyword
     */
}
