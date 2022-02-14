public class StringManipulation {
    public static void main(String[] args) {
        String temp = "This is a sample sentence";
        // write a function to print each character of the string separately on a new line
        // palindrome are string that read the same from the beginning and end
        // String temp = "kraark" , "kak"
        // Write a function that returns true if the given string is a palindrome otherwise return false
        // write a function that takes two strings and print them in ascending order.
        // city = bangalore city = ahmedabad
        order("bangalore","ahmedabad");

    }
    public static void order(String str1, String str2){
        if(str1.compareTo(str2)<0) {
            System.out.println(str1);
            System.out.println(str2);

        }
        else {
            System.out.println(str2);
            System.out.println(str1);

        }

    }
}
