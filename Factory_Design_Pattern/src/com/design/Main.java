package com.design;

import com.design.factory.AnimalFactory;
import com.design.factory.LABurgerFactory;
import com.design.factory.NYCBurgerFactory;

public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        animalFactory.getAnimal("herbi");
        animalFactory.getAnimal("non");

        //Burger
        NYCBurgerFactory nycFactory = new NYCBurgerFactory();
        nycFactory.createBurger("Cheese");
        nycFactory.createBurger("NonCheese");

        LABurgerFactory laFactory = new LABurgerFactory();
        laFactory.createBurger("Cheese");
        laFactory.createBurger("NonCheese");
    }
}
