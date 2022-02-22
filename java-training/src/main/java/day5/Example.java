package day5;

import java.util.concurrent.TimeUnit;

public class Example {
    private static volatile boolean stop=false;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(!stop) //  copy the stop variable into a different variable internal to it.
                    i++;
                // The above code internally gets optimized
                // and gets converted into
                // if(!stop)
                     //  while(true)
                       //    i++;
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        stop=true;
        // Any change made in one Thread may not be available immediately
        // to another thread.


// to generate serial numbers starting from 0
        // function or a class that has a function that returns the next serial number starting
        // from 0. 0, 1, 2, 3,...
        // Such that it works properly in a multithreaded scenario.
        // Thread-safe
        /*
        1) write a simple function for non multithreaded scenario
        2) create two threads and call your function and see if it's workign fine
        -> every call should return the next serial number
        3) Fix it
         */
    }
}
