package com.design.table;

public class VictorianTable implements Table {
    @Override
    public void eat() {
        System.out.println("VictorianTable used for dining purpose");
    }

    @Override
    public void study() {
        System.out.println("VictorianTable used for studying");
    }
}
