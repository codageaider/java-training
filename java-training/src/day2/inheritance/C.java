package day2.inheritance;

 class A {
    public A(){
        System.out.println("Inside A no-arg constructor");
    }
}
class B extends A{

}
public class C{
    public static void main(String[] args) {
        B b = new B();
    }
}
