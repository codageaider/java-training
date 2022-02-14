import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        // Generate a random number between 0 and 1
//        System.out.println(Math.random());
        /*
        Simulate a coin toss for 10 tosses
        head, tail
         */
        System.out.println("Toss the coin 10 times");
        for (int i = 0; i < 10; i++) {
            double random = Math.random();
            if (random < 0.5)
                System.out.print("head  ");
            else
                System.out.print("tail  ");
        }
        System.out.println(Math.floor(0.7));

    }
// generating an integer between a and b both inclusive
    // generateRandomNumber(1,10) -> 1,2,3,4,5,6,7,8,9,10
    /*
    0<Math.random()<1  ---> provided by java
    0< Math.random()*(b+1-a) <b+1-a
    0+a< Math.random()*(b+1-a) +a<b+1-a+a
     a < Math.random*(b+1-a) + a <  b+1
     So Math.random*(b+1-a) + a could be anything between a and b+1

     //
     */
    public int generateRandomNumber(int a, int b) {
        //a< Math.random()*(b+1-a)+a  < b+1
        return (int) Math.floor(Math.random() * (b + 1 - a) + a);
        // new Random().nextInt((b+1-a)+1)+a;
    }

    // floor(3.5) = 3
    // generates a random integer from 0 to a
    public int generateRandomNumber(int a) {
        //0<Math.random()*(a+1)<a+1
        return (int) Math.floor(Math.random() * (a + 1));
    }
}
