package com.design.processor.Animal;

public class CarnivorousAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("Eating meat");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping after chicken dinner");
    }
}
