package day7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {

    }
    // n = size of list
    public static boolean twoSum(List<Integer> list, Integer sum){
        for(int i=0;i<list.size();i++) //<- n times
            for(int j=i+1;j<list.size();j++) // n-i
                if(list.get(i)+list.get(j)==sum)
                    return true;

                return false;
    }
    // Time complexity of this code ?
    // O(n^2)
    // number of steps to execute this code = n^2
    // n + n-1 + n-2 + ... 1 = n *(n+1)/2 = n^2/2 + n/2 ~ n^2

    // Time Complexity of this code is O(n) on average ~ n steps in average
    // Try passing a big list and sum
    public static boolean twoSumUsingMap(List<Integer> list, Integer sum){
       Map<Integer,Integer> map = new HashMap<>();
       /*
        key is the number in the list and the value is
         how many times does that value occurs in the list.
         1 , 2, 3, 4, 5, 1, 1, 4
         1->3 , 2->1, 3->1, 4->2, 5->1

        */
       for(Integer element: list) {
           if (map.containsKey(element))
               map.put(element, map.get(element) + 1);
           else
               map.put(element, 1);
       }
       // Time Complexity of put, containsKey and get is O(1) on average
        // constant amount of time like 1 step, 2 step, 3 step,,...
        // but the steps will not be a function of n
           /*
           we will loop over the list
           and for each element we will check if sum-element is there in
           the list or not.
           list.get(0) = a , sum- a is there in the list of nor.
           sum - a = b , a+b = sum

            // 1 , 2, 3, 4, 5, 1, 1, 4  , sum = 9
            1 , 9-1 = 8  not |  4 , 9-4 = 5 this is there in the list 9 = 4 +5
            2 , 9-2 = 7 not
            3 , 9-3 = 6 not
           for element in list
               if sum-element is in list
                   return true
                   1, 2,3, 4, 5, 5   sum = 10
                   5 + 5 =10
            return false
            */
           for(Integer element: list) {
               int b = sum - element;
               if (map.containsKey(b)) {
                   if(b!=element)
                       return true;
                   int count = map.get(b);
                   if(b==element && count>1)
                      return true;
               }
           }
           return false;
       }
       // maven -> configure hibernate
    //  a mysql-connector jar file to our project.
    // hibernate we have to include some more jar files to our project.
    // maven simplifies this.

    }
