package day4;

public class Multithreading {
    /*
    you want to run multiple tasks concurrently.
    A program may consits of many tasks that can be run concurrently.
    A thread is the flow of eecution, from beginning to the end of a task.
    Task - adding a list of numbers
    list of size 10_000_000
    Task-1 - sum the elements from 1 to 5_000_000 -> return a number sum1
    Task-2 - sum the elements from 5_000_001 to 10_000_000 -> return a number sum2
    sum1+ sum2 -> final return value
    Create a thread to execute task1 and create a thread to execute task2
    and run them.
    for(Integer element: List)
    sum+=element

    (i)
    Task-1    Task-2
    In case of multiple cores : Task-1 will be executed by say core-1 and Task-2
    will be executed by core-2
    if you have a single core two differents that will be executed on the same
    core concurrently.

     100 millisecond to sum the list in a normal program without thread.
     If you introduce threads it will take 50 milliseconds

   (ii)  Task-1 and Task-2
    Now in a linear program first Task-1 will be finished and then Task-2 will be finished.
    But suppose you don't want to wait for Task-1 to be finished before starting Task-2

     */
    public static void main(String[] args) throws InterruptedException {
        // first all the 1's will get printed and then all the 2's will get printed.
        Print print1 = new Print(1, 1000); // one thread will execute this task
        Print print2 = new Print(2,1000); // one thread will execute this task
        Print print3 = new Print(3,1000);
        Thread thread1 = new Thread(print1);
        Thread thread2 = new Thread(print2);
        Thread thread3 = new Thread(print3);

        thread3.setPriority(Thread.MAX_PRIORITY);
        // Very high probability that a thread will get more of CPU time.

        // thread3 we assigned it a high priority max..
        // in some cases it finished at the last.
        // core1 , core2 , core3
        // core1<- thread1 , core2<- thread2 , core3<-thread3, processes1, process2,...
        // If the other high priority processes that are
        // assigned to a core to which our high priority
        // thread is assigned. Then
        // our computers were single processor or single core.
        // Then we will see that a thread will higher priority finishes first.
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread1.setName("thread-1");
        thread2.setName("thread-2");
        thread3.setName("thread-3");

        thread1.join(); // it forces the thread to wait for thread1 to finish
        thread2.join(); // this will force the thread to wait till thread2 is finish
        thread3.join();
//        for(int i=0;i<=100;i++){
//            System.out.println("3");
//        }
//        CustomThread customThread = new CustomThread(5);
//        // priority is between 1 and 10
//        // If there is a thread with higher priority then the threads with
//        // lower prioerity will wait.
//        customThread.setPriority(7);
//        customThread.start();

    }
}
     class Print implements Runnable{
        private Integer integerToPrint;
        private Integer numOfTimeToPrint;

        public Print(Integer _integerToPrint,Integer _numOfTimeToPrint){
            integerToPrint=_integerToPrint;
            numOfTimeToPrint=_numOfTimeToPrint;
        }

         @Override
         public void run() {
             for(int i=0;i<numOfTimeToPrint;i++) {
                 System.out.println(Thread.currentThread().getName() + " , "+integerToPrint);
//                 try {
//                     Thread.sleep(1000);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
             }
         }
     }

