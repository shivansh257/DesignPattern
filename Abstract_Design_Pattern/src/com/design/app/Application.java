package com.design.app;

import com.design.factory.FurnitureFactory;
import com.design.chair.Chair;
import com.design.table.Table;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */

public class Application {
    private final Chair chair;
    private final Table table;

    public Application(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.table = factory.createTable();
    }

    public void getFurniture() {
        chair.hasLegs();
        chair.sitOn();
        table.eat();
        table.study();
    }
}
