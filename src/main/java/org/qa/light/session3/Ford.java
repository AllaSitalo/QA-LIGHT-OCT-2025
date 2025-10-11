package org.qa.light.session3;

public class Ford implements ICar {
    @Override
    public void turnLeft() {
        System.out.println("Ford Turns Left");
    }

    @Override
    public void turnRight() {
        System.out.println("Ford Turns Right");
    }

    @Override
    public void drive() {
        System.out.println("Ford Drives");
    }
}
