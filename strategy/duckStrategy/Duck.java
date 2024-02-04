package com.strategy.duckStrategy;

public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    /**
     * Rather than handling the fly behavior itself, the Duck object delegates that
     * behavior to the object referenced by flyBehavior.
     */
    void performFly() {
        flyBehaviour.fly();
    }

    void performQuack() {
        quackBehaviour.quack();
    }

    void swim() {
        // swim
    }

    void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    // same setter for quack
}
