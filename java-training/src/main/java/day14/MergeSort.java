package day14;

import day12.Sorting;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MergeSort implements Sorting {
    public MergeSort(){
        System.out.println("Inside Merge sort constructor");
    }
    @Override
    public void sort(List<Integer> listToBeSorted) {
// Algorithm that implements the merge sort algorithm
        System.out.println("Sorting numbers using mergesort");
    }
}
