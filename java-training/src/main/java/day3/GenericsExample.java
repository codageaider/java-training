package day3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // It defines a generic ArrayList class for storing elements of a generic type
        List<String> list = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<Integer>();
        // a class can store any general type of objects or the type of object is a parameter

        // Detects error at compile time.

//public interface Comparable<T>
        // <T> represents a formal generic type and which can be replaced with any concrete type
        // T cannot be primitive data type
        // wrapper class like Integer, Double list<int> is not support

        List dates = new ArrayList();
        dates.add(new Date());
        dates.add(new String());// without generics type safety is not possible

        System.out.println("asdkahslkdjsal");
        List<Date> dates2 = new ArrayList<>();
        dates2.add(new Date());
//        dates2.add(new String());
        // Stack?
        // (i) what parameters or instance variable this class will have
        // (ii) what methods this class will have

    }
}
