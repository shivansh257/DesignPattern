package com.design.processor.Burger;

import com.design.interfaces.Burger;

public class NYCMac implements Burger {
    @Override
    public void perpareBurger() {
        System.out.println("NYC Mac");
    }
}
