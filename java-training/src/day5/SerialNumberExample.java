package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SerialNumberExample {

    // remove duplicacy from this code.
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000_00; i++)
                    System.out.println(Thread.currentThread().getName()
                            + " , " + SerialNumberGenerator.nextNumber());
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000_00; i++)
                    System.out.println(Thread.currentThread().getName()
                            + " , " + SerialNumberGenerator.nextNumber());

            }
        });
        executorService.shutdown();
    }
}

class SerialNumberGenerator {
    private static int nextNumber = 0;

    public static synchronized int nextNumber() {
        return nextNumber++;
    }

}


