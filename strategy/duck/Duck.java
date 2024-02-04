package com.strategy.duck;

public abstract class Duck {
    void fly() {
    }

    void quack(){
    }

    void swim(){
    }
}

// now concrete will inherit it and will have all the methods. Even if it doesn't fly.
// now we will add overrides in the code.
// eg- rubber duck fly{return null;}, quack {return null};

/** Design principle
 * Identify the aspects of your application that vary and separate them from what stays the same
 * take out fly and quack
 */
