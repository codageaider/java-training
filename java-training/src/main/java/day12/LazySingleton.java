package day12;
/*
(i) You cannot create more than 1 object of this class
(ii) Each time you call the getInstance method the same object is returned
 */
public class Singleton {
    private static Singleton singleton=null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(singleton==null)
              singleton = new Singleton();
        return singleton;
    }
}
/*
There are in general two types of Object Initializations /creations
(i) Lazy Instantion (Lazy Loading/ Lazy Initialization)
(ii) Eager Instantion (Eager Loading / Eadger Initialization)
 */