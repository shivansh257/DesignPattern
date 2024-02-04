package com.strategy.duckStrategy;

public class RubberDuck extends Duck {
    RubberDuck() {
        this.flyBehaviour = new NoWings();
        this.quackBehaviour = new Squeak();
    }
}
