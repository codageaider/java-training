package day4;

import java.util.*;
import java.util.function.Consumer;

public class DataStructures {
    /*
     Stack, Queue, List
     */
    public static void main(String[] args) {
        // List is a Collection
        // concrete collection object using ArrayList
        List<String> list = new ArrayList<>();
        list.add("name-1");
        list.add("name-2");
        list.add("name-3");
//        System.out.println(list.contains("name-2"));
//        System.out.println(list.contains("name-21"));
//        System.out.println(list.remove("name-2"));
//        System.out.println(list.get(0));
//        System.out.println(list.size());

//        for(int i=0;i<list.size();i++)
//            System.out.println(list.get(i));
//
//        for(String str:list)
//            System.out.println(str);

//       Iterator<String> iterator = list.iterator();
//       while(iterator.hasNext()){
//           System.out.println(iterator.next());
//       }
       // Iterator is a design pattern to walk through
        // a data structure without knowing the internal
        // details of the data structure
        LinkedList<String> stringLinkedList = new LinkedList<>();
       stringLinkedList.add("link-1");
       stringLinkedList.add("link-2");
       stringLinkedList.addLast("link-3");
       stringLinkedList.addFirst("link-0");
       // link-0  link-1  link -2  link-3
        // If we use this get method on an array list
        // it will run very fast. Because it stores the elements in
        // an

        // But linkedlist
        //
//        for(String element:stringLinkedList)
//            System.out.println(element);

// get method for linked list has worse performance
        // To access an element at a particular index
        // in a linked list.

        // Not efficient to print out all the elments of
        // the linkedlist, because of get method
        for(int i=0;i<stringLinkedList.size();i++)
            System.out.println(stringLinkedList.get(i));

        // Efficient way -> This approach uses iterator internally
        for(String element: stringLinkedList)
            System.out.println(element);

        // This is the faster way to print all elements
        // of a linked list
        Iterator<String> iterator = list.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
     List<String> names = Arrays.asList("red","green","blue");
       List<String> names1 = new ArrayList<>();
       names1.add("rest");
               list.addAll(names1);
     List<Integer> list1 = Arrays.asList(2,4,7,10,11,45,50,59,60,66);
        System.out.println(Collections.binarySearch(list1,7));
        List<Integer> list2 = Arrays.asList(1,7,3,9,10,100,50);
//        Collections.sort(list2);
//        Collections.sort(list2,Collections.reverseOrder());
        Collections.reverseOrder();
        // Anonymous class. Because we haven't defined a class which implements
        // the comparator interface
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
        Collections.shuffle(list2);
        System.out.println(list2);

        List<String> destinationList = Arrays.asList("y1","r1","g1","b1");
        List<String> sourceList = Arrays.asList("w1","b1");
        Collections.copy(destinationList,sourceList);
        System.out.println(destinationList);
        System.out.println(Collections.max(destinationList));
        List<Integer> integerList = Arrays.asList(1,2,3,4,10,15,4,7,7);
        System.out.println(Collections.max(integerList));
// Collections class contains static methods for manipulating lists and collections.

        // String temp = "The is a  sentence is " . How many times doe
        // the word is occurs in this sentence. and use the frequency method to find out the number of occurences of
        // a particular element in it.

       Stack<Integer> stack = new Stack<>();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       // 1 <- 2<- 3
        System.out.println("size before removing = "+stack.size());
        System.out.println(stack.pop());
        System.out.println("size after removing = "+stack.size());
        // Stack -> last in , first out
        // Queue -> first-in, first out

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        // 1<-2<-3
        System.out.println("element removed = "+queue.remove());
        System.out.println("queue = "+queue);
        queue.add(4);
        // 2 3 4
        System.out.println("queue = "+queue);

        // priority queue -> elements are assigne a priority.
        // When you call remove method, the element with the highest priority is removed first
        //
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(25);
        priorityQueue.add(15);
        priorityQueue.add(30);
        // 10<-25<-15<-30
        // priority queue internally defines a default priority of elements.
        // 10 , 15, 25, 30
        // 10 has the highest, 15 has next higher priority,
        System.out.println("Removing the elements one by one");
        while(priorityQueue.size()>0)
            System.out.println(priorityQueue.remove());

        System.out.println("Priority queue with custom priority");
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue2.add(10);
        priorityQueue2.add(25);
        priorityQueue2.add(15);
        priorityQueue2.add(30);
        while(priorityQueue2.size()>0)
            System.out.println(priorityQueue2.remove());

// write a priority queue of strings which removes the elements in descending order
        // lexicographically without using the Collections.reverseOrder()
    }
}
