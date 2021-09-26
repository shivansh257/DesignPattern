package com.design.table;

public class ModernTable implements Table {
    @Override
    public void eat() {
        System.out.println("ModernTable used for dining purpose");
    }

    @Override
    public void study() {
        System.out.println("ModernTable used for studying");
    }
}
