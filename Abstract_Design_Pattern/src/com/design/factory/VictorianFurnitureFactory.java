package com.design.factory;

import com.design.chair.Chair;
import com.design.table.Table;
import com.design.chair.VictorianChair;
import com.design.table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
