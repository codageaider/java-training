package test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 1;
        int b = 2;
        boolean c = true;
        boolean d = false;
        boolean e = c && d; // and operator --> evaluates to true if both are true
        boolean f = c || d; // or operator --> evaluates to true if any one of them is true.
        System.out.println(e);
        System.out.println(f);
        // & -> bitwise and operator
        a = a +1;
        b++; // unary operators ++ is a unary operator
        int g = 3;
        g--; // is a short form for g = g-1
        System.out.println(g);
        boolean h = true;
        System.out.println("!h = "+!h);
        // ! -> logical complement operator
        int i = 0x000F;
        int j = 0x2222;
        System.out.println(i);
        // hexadecimal number system
        // decimal system = 123 = 1 * 10^2 + 2 * 10^1 + 3 * 10^0  = 100 + 20 + 3 = 123
        // or base 10 system
        // In hexadecimal system the base is 16
        // 0 , 1 , 2 ,....9, A=10, B=11 , C=12, D=13 , E=14, F=15
        //0x000F; 000F = 0 * 16^3 + 0 * 16^2 + 0 * 16^1 + 15 * 16^0 = 15
        // i = 0x000F  = 0000000000001111
        // binary system 0 or 1   4 in binary = 100 =
        int k = 0b100; // 000000   << 1 -> 00001000
        int l = 0b110;
        int m = k + l;
        System.out.println("m = "+m);
        System.out.println(k + " "+l);
        System.out.println(k & l);
        System.out.println(k | l);
        int n = k<<1;
        System.out.println("n = "+n);
        int O1 = k>>1;
        System.out.println("O = "+O1);
        int o2 = k>>3;
        System.out.println("o2 = "+o2);
        // 100
        // 110  =   100
        int i1 = 10;
        int n1 = ++i1%5;
        System.out.println("n1 = "+n1);
        // ++i i++
        


    }
}
