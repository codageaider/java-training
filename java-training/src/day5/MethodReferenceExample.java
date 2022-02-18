package day5;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.forEach(a-> System.out.println(a));
        list.forEach(System.out::println);
        Speak speak = SpanishSpeaker::speaker;
        Speak speak2 = ()-> System.out.println("asda");
        speak.speak();

        // MEthod reference "::" you can provide a reference to a method inside a class
    }
}
interface Speak {
    void speak();
}
class SpanishSpeaker {
    public static void speaker(){
        System.out.println("Speaks spanish");
    }
}
