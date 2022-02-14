public class PrintTriangle {
    public static void main(String[] args) {
       printTriangle(5);

    }
    // n is the number of rows
    public static void printTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("End of triangle");
    }
//    public static double findMinimum(double[] array){
//
//    }
}
