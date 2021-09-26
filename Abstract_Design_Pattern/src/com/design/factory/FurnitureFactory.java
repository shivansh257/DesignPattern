package com.design.factory;

import com.design.chair.Chair;
import com.design.table.Table;
/**
 * Abstract factory knows about all (abstract) product types.
 */

public interface FurnitureFactory {
    public Chair createChair();

    Table createTable();
}
