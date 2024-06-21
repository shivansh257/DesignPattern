package singleton;

public class SingletonDoubleLock {
    private volatile static SingletonDoubleLock uniqueInstance;

    private SingletonDoubleLock(){
    }

    public static SingletonDoubleLock getInstance() {
        if(uniqueInstance == null) {
            synchronized(Singleton.class) {
                if(uniqueInstance == null)
                    uniqueInstance = new SingletonDoubleLock();
            }
        }
        return uniqueInstance;
    }
}

// thread safe.
// synchronized only first time
// lazy
// overkill if there is no performance concerns
// can only be used for java 5 and above
