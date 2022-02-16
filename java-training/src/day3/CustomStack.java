package day3;

import java.util.ArrayList;
import java.util.List;

public class CustomStack<E> {
    private List<E> list = new ArrayList<>();

    public E pop() {
        E lastElement = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return lastElement;
    }

    public void push(E element) {
        list.add(element);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
