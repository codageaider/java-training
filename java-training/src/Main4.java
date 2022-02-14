public class Main4 {
    public static void main(String[] args) {
        // write a function to compute gcd of two numbers
    }

    // Iterative approach
    public static int findgcd(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        return gcd;
    }
// How many steps does this code take to execute or how many times it goes over the
    // for loop?  min(x,y) steps
    // Time complexity of a code /algorithm takes min(x,y) steps
    // O(min(x,y))

    // Euclidean algorithm to calculate the gcd of two numbers
    // O(log(min(x,y)) ~ log(min(x,y))

    // Recursive approach
    public static int findGcdWithEuclideanAlgorithm(int x, int y) {
        // gcd(x,y) = gcd(y,x%y)  x>y
        int x1 = Math.max(x, y);
        int y1 = Math.min(x, y);
        if (x1 == y1)
            return x1;
        else if (x == 1 || y == 1)
            return 1;
        return findGcdWithEuclideanAlgorithm(y1, x1 % y1);
    }

    public static int findGcdWithEuclideanAlgorithmIterative(int x, int y) {
        int temp;
        while (x != 0) {
            temp = x;
            x = y % x;
            y = temp;
        }
        return y;

    }

}
