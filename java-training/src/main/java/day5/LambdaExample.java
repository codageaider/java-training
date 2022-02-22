package day5;

public class LambdaExample {
    public static void main(String[] args) {
        // Anonymous class
        System.out.println(function(1, 2, new Operation() {
            @Override
            public int operate(int num1, int num2) {
               return (int)Math.pow(num1,num2);
            }
        }));
        // There is no way to pass a function as a parameter in Java.
        // Passing function as a parameter, this facility is there in some of other
        // programming languages. Functional programming.
        // Think of programming in a different way as passing functions.
        System.out.println(function(1, 2, (a,b)->(int)Math.pow(a,b)));

        // lambda
        Operation operation = (a,b)->{
            int x = a *b;
            return a+x;
        };
        Operation division = (a,b)->a/b;
// write a lambda to concatenate two strings
        // write a function that converts a given string to lowercase
        // then convert it to lambda
        // (i)
        // write a function that takes a string and an operation.
        // and performs that operation on the string.
        // (ii)
        //  write a function that takes a list of integers as argument and a second argument
        // called filterCriteria. It returns a list removing all numbers that match the filter.
        // remove all things that filterCriteria.condition(int a) returns a boolean

        System.out.println(operation.operate(2,4));
    }
    // function(a,b,operation) and depending upon this third argument. performs
    // the operation.
    // a + b , a - b
    // function(a,b,operation)  operation = "+", "-", "*", "/"

    // I can add any number of new operators and this function definition
    // remain same.
    public static int function(int num1, int num2, Operation operation){
        return operation.operate(num1,num2);
    }

}
interface Operation{ // Functional Interfaces
    public int operate(int num1, int num2);
}
class AddOperation implements Operation{

    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }

}
class MinusOperation implements  Operation{

    @Override
    public int operate(int num1, int num2) {
        return num1-num2;
    }

}
// try writing a power operation.