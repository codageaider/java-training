package day12;

/*
Dependency Injection
HTTP GET, POST, PUT methods
Postman <-- This is used to make HTTP GET, POST, PUT method calls

Ex:
Make a class called ShareTrading
which has a property called strategy
strategy is an interface.
Make a concrete implementation of Stragegy interface
and a Constructor Injection to Inject it to the object of ShareTrading.

Dependency Injection is also sometimes known as Inversion of Control (IOC)

 */
public class Main {
    public static void main(String[] args) {
        Users user = new Users();
        user.addSortingMethod(new QuickSort());
        user.sort();
    }
}
