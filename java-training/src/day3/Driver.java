package day3;

public class Driver {
    public static void main(String[] args) {
        CustomStack<Integer> integerCustomStack = new CustomStack<>();
        integerCustomStack.push(1);
        integerCustomStack.push(2);
        integerCustomStack.push(3);
        integerCustomStack.push(4);

        System.out.println(integerCustomStack.getSize());
        System.out.println(integerCustomStack.pop());
        System.out.println(integerCustomStack.getSize());
        System.out.println(integerCustomStack.isEmpty());
        integerCustomStack.pop();
        integerCustomStack.pop();
        integerCustomStack.pop();
        integerCustomStack.pop();
        integerCustomStack.pop();
        integerCustomStack.pop();
        integerCustomStack.pop();
        integerCustomStack.pop();
        integerCustomStack.pop();
        integerCustomStack.pop();

        System.out.println(integerCustomStack.isEmpty());


    }
}
