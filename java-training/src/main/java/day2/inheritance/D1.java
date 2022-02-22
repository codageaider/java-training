package day2.inheritance;

class A1 {
 /// implicit insertion of default constructor

}
class B1 extends A1 {
    public B1(){
        super();
    }
}
public class D1 {
    public static void main(String[] args) {
        B1 b = new B1();

    }
}
