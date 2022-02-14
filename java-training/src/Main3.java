public class Main3 {
    public static void main(String[] args) {
        // Generate a random number between 0 and 1
//        System.out.println(Math.random());
        /*
        Simulate a coin toss for 10 tosses
        head, tail
         */
        System.out.println("Toss the coin 10 times");
        for(int i=0;i<10;i++){
            double random = Math.random();
            if(random<0.5)
                System.out.print("head  ");
            else
                System.out.print("tail  ");
        }
    }
}
