package day14;

import day12.Sorting;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BubbleSort implements Sorting {
    public BubbleSort() {
        System.out.println("Bubble Sort Constructor Invoked");
    }

    @Override
    public void sort(List<Integer> listToBeSorted) {
// This will sorting using bubble sort algorithm
        System.out.println("Sorting using bubble sort");
    }
}
