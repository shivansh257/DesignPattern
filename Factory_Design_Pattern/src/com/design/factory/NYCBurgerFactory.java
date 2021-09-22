package com.design.factory;

import com.design.interfaces.Burger;
import com.design.interfaces.BurgerFactory;
import com.design.processor.Burger.NYCCheese;
import com.design.processor.Burger.NYCMac;

public class NYCBurgerFactory implements BurgerFactory {
    Burger burger;
    @Override
    public Burger createBurger(String type) {
        if (type.equals("Cheese")) {
            burger = new NYCCheese();
        } else {
            burger = new NYCMac();
        }
        burger.perpareBurger();
        return burger;
    }
}
