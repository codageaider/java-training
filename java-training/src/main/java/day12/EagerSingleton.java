package day12;

/*
(i) You cannot create more than 1 object of this class
(ii) Each time you call the getInstance method the same object is returned
 */
public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return singleton;
    }
}
/*
There are in general two types of Object Initializations /creations
(i) Lazy Instantion (Lazy Loading/ Lazy Initialization)
(ii) Eager Instantion (Eager Loading / Eadger Initialization)
 */