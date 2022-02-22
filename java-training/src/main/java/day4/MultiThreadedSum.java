package day4;

public class MultiThreadedSum {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++)
            array[i] = i;
        // 0 + 1 + 2 + ... +99 = 4950
        CustomSumThread sumfirstPartThread = new CustomSumThread(true, array);
        CustomSumThread sumSecondPartThread = new CustomSumThread(false, array);
        sumfirstPartThread.start();
        sumSecondPartThread.start();
        sumfirstPartThread.join();
        sumSecondPartThread.join();

        int sumOfFirstPart = sumfirstPartThread.getSum();
        int sumOfSecondPart = sumSecondPartThread.getSum();
        System.out.println(sumOfFirstPart+sumOfSecondPart);



    }
}

class CustomSumThread extends Thread {
    private int sum;
    private boolean firstHalf;
    private int[] array;

    CustomSumThread(boolean _firstHalf, int[] _array) {
        firstHalf = _firstHalf;
        array = _array;
        sum = 0;
    }

    public int getSum() {
        return sum;
    }
    public void run() {
        int startIndex;
        int endIndex;
        if (firstHalf) {
            startIndex = 0;
            endIndex = ((array.length) / 2) - 1;
        } else {
            startIndex = (array.length) / 2;
            endIndex = array.length - 1;
        }

        for (int i = startIndex; i <= endIndex; i++)
            sum += array[i];
    }
}
