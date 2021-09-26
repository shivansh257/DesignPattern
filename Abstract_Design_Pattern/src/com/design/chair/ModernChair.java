package com.design.chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Modern Chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("single people can sit on modern chair");
    }
}
