package day5;

public class Example {
    public static void main(String[] args) {
        String str = "asdasda";
        // space is allocated for this string.
        for(int i=0;i<1000;i++)
        {
            if(i==500)
                str=null;
        }

        // after the 500th iteration the str refers to null.
        // But still the string "asdasda" takes up space in RAM
        // Garbage collection
        // It automatically finds out which memory can be cleared.
        // and is no longer referenced
        // Is done using a Daemon thread. A thread that's working in
        // the background.

        // Garbage collector thread -> is to help support other tasks or the user tasks.
        // (i) background threads
        // (ii) service threads -> provide service to user threads.

        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("This is a daemon thread");
                }
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
            }
        }).start();

        while(true){
            System.out.println(daemonThread.getName() + " , "+daemonThread.isDaemon() + " , "+ daemonThread.getState());
        }
    }
}
