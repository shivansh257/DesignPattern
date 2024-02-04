package com.singleton;

public class SingletonEager {
    private static SingletonEager uniqueInstance = new SingletonEager();

    private SingletonEager(){
    }

    public static SingletonEager getInstance() {
        return uniqueInstance;
    }
}

// it is thread safe.
// always creating instance before hand.
// shows developer have less knowledge about patterns