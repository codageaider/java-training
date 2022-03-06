package day12;
/*
(i) You cannot create more than 1 object of this class
(ii) Each time you call the getInstance method the same object is returned
 */
public class LazySingleton {
    private static LazySingleton lazySingleton =null;
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(lazySingleton ==null)
              lazySingleton = new LazySingleton();
        return lazySingleton;
    }
}
/*
Thread-1 is at line 12, Thread-2 is at line 12  Both will go to line 13 because the variable is currently null
Thread-1 goes to line13. lazySingleton=new LazySingleton();
Thread-1 goes to line 14 and return lazySingleton is executed

Thread-2 is at line 13 and it assigned lazySingleton = new LazySingleton();
This will cause a new object to be created which is different from the earlier

Thread-1  :    LazySingleton lazySingleton = LazySingleton.getInstance();  <--- This will be assigned an object new LazySingleton()
Thread-2  :    LazySingleton lazySingleton = LazySingleton.getInstance(); <-- This will get a different new LazySingleton()
So our class breaks the singleton property in a multithreaded scenario.

 */
/*
There are in general two types of Object Initializations /creations
(i) Lazy Instantion (Lazy Loading/ Lazy Initialization)
(ii) Eager Instantion (Eager Loading / Eadger Initialization)
 */