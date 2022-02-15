package day2;

import java.util.ArrayList;
import java.util.List;

public class ListExample{

    public static void main(String[] args) {
        // student[5] when the array gets full we needed to doble the size of the array
        // students array and we doubled the size of student array when it reached its limit
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<200;i++)
            list.add(i);
        for(int i=0;i<200;i++)
            System.out.println(list.get(i));

    }
}
