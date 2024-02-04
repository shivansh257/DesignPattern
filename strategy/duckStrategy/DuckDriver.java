package com.strategy.duckStrategy;

public class DuckDriver {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.setFlyBehaviour(new FlyWithWings());
        rubberDuck.performFly();
    }
}
