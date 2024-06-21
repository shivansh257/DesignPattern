package singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){
    }

    public static Singleton getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}

// it is not thread safe. 2 thread can be inside if statement together
// lazy

/**
 * Resolution for multi threading
 * 1. Synchronization
 * 2. eager initialization
 */


/**
 * Still there will be issues with multi class loader
 */

/**
 * using static variables might provide the same work. But using static can become complex and difficult to debug.
 */
