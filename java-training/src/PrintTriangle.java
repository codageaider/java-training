public class PrintTriangle {
    public static void main(String[] args) {
        // recursive function gives Stack over flow error for n >=12000
        System.out.println(sumRecursive(12000));
        // iterative works for
        System.out.println(sumIterative(200000000000l));


    }

    // n is the number of rows
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("End of triangle");
    }
//    public static double findMinimum(double[] array){
//
//    }

    /*
     The idea of recursion is that you solve a smaller problem
     and use that result to solve the larger problem.
     factorial(n) = factorial(n-1) * n   <-- recursive definition
     All recursive functions will have a base case and the recursive definition
     */
    public static long factorialRecursive(long n) {
        if (n == 1)
            return 1;
        return factorialRecursive(n - 1) * n;
    }

    public static long factorialIterative(long n) {
        long fact = 1;
        for (long i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }
    // return the value of numbers from 1 to n
    // sum(n)  = 1 + 2 + ... (n-1) + n
    // sum(n-1)= 1 + 2 + ...+(n-1)
    // sum(n) = sum(n-1) + n
    // (i) figuring out the algorithm
    //    what steps or process or approach you will use to calculate this
    // (ii) spot the recursion <-- your observations.
    public static long sumRecursive(long n){
        if(n==1)
            return 1;
       return n + sumRecursive(n-1);
    }
    /* there will be 12000 function calls in this.
    whenever a function call is made its variables are stored in something called Stack.
    Stack takes space.
    sumRecursive(12000) -> 12000 + sumRecursive(11999)
                                   11999 + sumRecursive(11998)
                                         + 11998 + sumRecursive(11997)
                                                  + 11997 + sumRecursive(11996)

                                                          4 + sumRecursive(3) = 4 +5 =9
                                                          3 + sumRecusive(2) - 3 + 2 = 5
                                                            1 + sumRecrusive(1)  - [1 + 1] = 2
                                                               + 1
     */

    // return the value of numbers from 1 to n
    // There is only 1 function call
    public static long sumIterative(long n){
        long sum=0;
        for(int i=1;i<=n;i++)
            sum+=i; // sum = sum +i;
        return sum;

    }
}
