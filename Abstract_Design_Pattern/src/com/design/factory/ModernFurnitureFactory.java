package com.design.factory;

import com.design.chair.Chair;
import com.design.table.Table;
import com.design.chair.ModernChair;
import com.design.table.ModernTable;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
