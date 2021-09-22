package com.design.factory;

import com.design.interfaces.Burger;
import com.design.interfaces.BurgerFactory;
import com.design.processor.Burger.LACheese;
import com.design.processor.Burger.LAMac;

public class LABurgerFactory implements BurgerFactory {
    @Override
    public Burger createBurger(String type) {
        Burger burger;
        if (type.equals("Cheese")) {
            burger = new LACheese();
        } else {
            burger = new LAMac();
        }
        burger.perpareBurger();
        return burger;
    }
}
