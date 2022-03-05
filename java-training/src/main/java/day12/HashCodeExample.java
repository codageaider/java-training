package day12;

public class HashCodeExample {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        QuickSort quickSort2 = new QuickSort();
        System.out.println("HashCode of quickSort = "+quickSort.hashCode());
        System.out.println("HashCode of quickSort2 = "+quickSort2.hashCode());
        Character c = 'A';
        System.out.println(c.hashCode());
//        HashCode of quickSort = 1393931310
//        HashCode of quickSort2 = 1358444045
    }
}
