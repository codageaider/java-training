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
        byte n3 = 123; // 8 bits
        short n4 = 1234; // 16 -bits
        // int -> 32 bit
        long z = 12345678991828l; // long has a storage of 64 bits ~ 2^64 =
        long z2 = 1234567899183128l;
        float f2 = 1.30f; // float - 32 bit
        float f3 = 1.4f;
        double d1 = 1.30;
        double d2 = 1.4; // double - 64 bit
        double d3 = 1.234;
        float f4 = f2 + f3;
        System.out.println((f4-(int)f4)*100);
        System.out.println("f4 = "+f4);
        System.out.println("d1 + d2 = "+(d1 + d2));
        System.out.println("f2 + f3 = "+(f2+f3));
        System.out.println("z+z2= "+(z+z2));
        System.out.println(String.format("%.2f",f4));
        char c1 = 'A';
        System.out.println(c1);
        int a1 = 1000_000;
        int[] array = new int[10];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        System.out.println(array[0]);

        int[] array2 = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("lst element = "+array2[9]);
        String test = "This is a sample string";
        System.out.println("length of the string = "+test.length());
        System.out.println("index = "+test.indexOf('i'));


    }
}
