package day5;

import java.util.concurrent.TimeUnit;

public class Example {
    private static  boolean stop=false;
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



    }
}
