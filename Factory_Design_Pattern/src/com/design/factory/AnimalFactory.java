package com.design.factory;

import com.design.processor.Animal.Animal;
import com.design.processor.Animal.CarnivorousAnimal;
import com.design.processor.Animal.HerbivorousAnimal;

public class AnimalFactory {

    public Animal getAnimal(String animal) {
        Animal animal1;
        if (animal.equals("herbi")) {
            animal1 = new HerbivorousAnimal();
        } else {
            animal1 = new CarnivorousAnimal();
        }
        animal1.eat();
        animal1.sleep();
        return animal1;
    }
}
