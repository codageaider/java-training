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

/*
Scope
1) Singleton <-- All beans are singleton scope
There will only be once copy of that object available.
2) Prototype

Singleton Design Pattern
Design a class such that only one copy of that class can be created.


 */