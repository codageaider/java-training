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
    public static void main(String[] args) {
        // first all the 1's will get printed and then all the 2's will get printed.
        Print print1 = new Print(1, 100); // one thread will execute this task
        Print print2 = new Print(2,100); // one thread will execute this task
        Thread thread1 = new Thread(print1);
        Thread thread2 = new Thread(print2);
        thread1.start();
        thread2.start();

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
             for(int i=0;i<numOfTimeToPrint;i++)
                 System.out.println(integerToPrint);
         }
     }

