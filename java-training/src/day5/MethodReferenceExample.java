package day5;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.forEach(a-> System.out.println(a));
        list.forEach(System.out::println);
        Speak speak = SpanishSpeaker::speaker;
        Speak speak2 = ()-> System.out.println("Speaks spanish");
        System.out.println("log of each element");
        list.forEach(Math::log);
        System.out.println(f(10,Math::log));
        Speak speak3 = new Speak() {
            @Override
            public void speak() {
                SpanishSpeaker.speaker();
            }
        };
        speak.speak();

        // MEthod reference "::" you can provide a reference to a method inside a class

    }
    public static double f(Integer a, MathOP mathOP){
          return mathOP.perform(a);
    }
}
interface MathOP{
    double perform(Integer a);
}
interface Speak {
    void speak();
}
class SpanishSpeaker {
    public static void speaker(){
        System.out.println("Speaks spanish");
    }
}
