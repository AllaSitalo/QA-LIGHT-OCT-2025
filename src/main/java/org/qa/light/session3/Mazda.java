package org.qa.light.session3;

public class Mazda implements ICar {
    @Override
    public void turnLeft() {
        System.out.println("Turning Left on Mazda");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning Right on Mazda");
    }

    @Override
    public void drive() {
        System.out.println("Mazda Moving Forward");
    }
}
