package day5;

public class DameonThreadAndUserThreadExample {
    public static void main(String[] args) {
        String str = "asdasda";
        // space is allocated for this string.
        for(int i=0;i<1000;i++)
        {
            if(i==500)
                str=null;
        }
/*
         after the 500th iteration the str refers to null.
         But still the string "asdasda" takes up space in RAM
         Garbage collection
         It automatically finds out which memory can be cleared.
         and is no longer referenced
         Is done using a Daemon thread. A thread that's working in
         the background.

         Garbage collector thread -> is to help support other tasks or the user tasks.
         (i) background threads
         (ii) service threads -> provide service to user threads.
         (iii)

        Two types of threads
        (i) User Thread
        (ii) Daemon Thread
               1) will exit if there is no user thread running
               2) There was an infinite loop in daemon thread, but still the program terminated
               3) When there was an inifinite loop in a user thread. The program didn't terminate
*/
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


        // This is a user thread
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();


    }
}
