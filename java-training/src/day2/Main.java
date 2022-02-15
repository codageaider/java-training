package day2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        // General for loop
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
        // Foreach loop
        for(int element: array){
            System.out.println(element);
        }
        //System.out.println(array[5]);
        // This will throw ArrayIndexOutOfBoundsException
        //int i = 1/0; // -> ArithmeticException

        String sentence = "thisisasamplesentence";
//        t->2, h - > 1, i->2
        // write a program which prints the count of each character in the string.
        int[] count = new int[26];
        // This count array we will use to store the count of each character.
        // a-z 0-25
        // each character has an ASCII encoding assigned to it internally.
        System.out.println("ascii code = "+(int)'a');
        System.out.println("ascii code = "+(int)'b');
        // a -> 97 , b -> 98,.... z- > 96 + 26
        // count array 0 to 25
        // (int)'a'-97 = 0, (int)'b'-97 = 98 - 97= 1, ... (int)'z'-97 = 96 + 26 - 97 = 25
        // this is a mapping from 0-25 to characters..

        for(char char1: sentence.toCharArray()){
            // we need to store the count of this char1
            count[(int)char1-97]++;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0)
                System.out.println("character "+(char)(i+97)+" occurs = "+count[i]);
        }
        // write a function that takes an int array and a an int key
        // and returns the first index of the array at which the key occurs
        // int[], int   , -1





    }
    // Linear Search
    // Time complexity of this function
    // length of arr
    public static int arrayIndex(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) return i;
        }
        return -1;
    }
    // The array that I pass to this function will always be
    // sorted in ascending order
    // 4,8,2,9 -> after sorting -> 2,4,8,9
    // Time complexity if O(n) or the linear search takes approximately steps = length of the array
    // Binary search -> O(log n) time or log(lenghth of the array)
    // [2,3,4],8,9,12,15   number ->4
}