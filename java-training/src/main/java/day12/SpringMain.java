package day12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

/*
Spring is a container for beans.
When we create objects in Spring they are called beans
container -> something that can store some data
Spring manages objects on our behalf.

IOC Container -> Inversion of control Container or ApplicationContext.

 */
@SpringBootApplication
public class SpringMain {
    public static void main(String[] args) {
        // Application context contains only one object provided by us
        // QuickSort, it contains MergeSort object also
        // fetch MergeSort object from the ApplicationContext
        // and call sort funtion on it.
        ApplicationContext context = SpringApplication.run(MyConfig.class, args);
        Sorting quickSort = context.getBean(QuickSort.class);
        quickSort.sort(new ArrayList<>());
        Sorting mergeSort = context.getBean(MergeSort.class);
        mergeSort.sort(new ArrayList<>());
        Sorting bubbleSort = context.getBean(BubbleSort.class);
        bubbleSort.sort(new ArrayList<>());
        Sorting heapSort = context.getBean(HeapSort.class);
        heapSort.sort(new ArrayList<>());
        System.out.println("Starter spring project");
        // How we can put beans into IOC Container or Application Context

    }
}
