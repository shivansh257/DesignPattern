package com.design.chair;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Chair/Table). All products of
 * the same family have the common interface.
 *
 * This is the common interface for buttons family.
 */

public interface Chair {

    public void hasLegs();

    public void sitOn();
}
