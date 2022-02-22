package day2.inheritance;

public class Driver {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle);
        Circle circle2 = new Circle(1,"red",true);
        System.out.println(circle.getColor());

        Apple apple = new Apple("apple");

        Circle circle3 = new Circle(1);
        Circle circle4 = new Circle(1);
        System.out.println(circle3.equals(circle4));
    }
}
