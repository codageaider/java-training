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
        // single dimensional array
        System.out.println("lst element = "+array2[9]);
        String test = "This is a sample string";
        System.out.println("length of the string = "+test.length());
        System.out.println("index = "+test.indexOf('i'));
        System.out.println(test);
        System.out.println(test.trim());
        System.out.println(test.startsWith("Th"));
        System.out.println(test.charAt(0));

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        System.out.println("matrix value = "+matrix[1][2]);
        System.out.println("matrix sum = "+(matrix[0][0]+matrix[0][1]+matrix[0][2]));
        System.out.println("length = "+matrix.length);
        int[] array1 = new int[5];
        System.out.println(array1[0]);

        // conditionals

        int n5 = 100;
        // if n5 is an odd number print odd otherwise print even
        if(n5%2==1) // this condition evaluated to true. then the block is executed
            System.out.println("odd");
        else
            System.out.println("even");

        int[] array3 = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
        // loop in java
        System.out.println("Printing all the elements of the array");
        for(i=0;i<array3.length;i++) {
            System.out.println(array3[i]);
        }
        int y = 6;
        // factorial(y) = 1 * 2 * 3 * .... * y
        // y = 5 factorial(y) = 1 * 2* 3*4*5 = 120

        int val=1;
        for(i1=1;i1<=y;i1++)
            val = val*i1;
        System.out.println("factorial(y) = "+val);
        int dayOfWeek =2; // 1= Monday,....7 = Sunday
        String day;
        switch(dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:

        }
        // for loop, while loop

//        while(expression){
//            statements;
//        }
        int i7=5;
        int fact=1;
        int ir=1;
        while(ir<=i7){
            fact = fact*ir;
            ir++;
        }
        System.out.println("factorial of "+i7+"!="+fact);
     int i8=1;
       do {
           i8++;

       } while(i8<=0);
        System.out.println("i8 = "+i8);

// write a do while statement to print numbers from 1 to 10

// write a program to print the following
//        *
//        **
//        ***
//        ****
//        *****


    }
}
