package day2.inheritance;

public class DiffOverLoadandOverriding {
    public static void main(String[] args) {
        A2 a = new A2();
        a.p(10);
        a.p(10.1);
    }
}

class B2 {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A2 extends B2 {
//    // overriding a method -> the return type and the argument are same
//    public void p(double i) {
//        System.out.println(i);
//    }
    // overloading a method -> signature is different
    public void p(int i){
        System.out.println(i);
    }
}
