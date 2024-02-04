package com.singleton;

public class SingletonSync {
    private static SingletonSync uniqueInstance;

    private SingletonSync(){
    }

    public static synchronized SingletonSync getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new SingletonSync();
        return uniqueInstance;
    }
}

// it is thread safe. 2 thread wont be entering if statement together
// lazy
// problem - sync adds overhead. So performance might be impacted by the factor of 100.
// can be used - if performance isn't concern