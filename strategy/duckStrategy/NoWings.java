package com.strategy.duckStrategy;

public class NoWings implements FlyBehaviour {
    public void fly() {
        System.out.println("cannot fly");
    }
}
