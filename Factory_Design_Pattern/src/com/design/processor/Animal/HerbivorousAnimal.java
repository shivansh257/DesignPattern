package com.design.processor.Animal;

public class HerbivorousAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("Eating grass");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping after grazing");
    }
}
