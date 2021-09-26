package com.design.chair;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair is recliner");
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian Chair provides footrest");
    }
}
