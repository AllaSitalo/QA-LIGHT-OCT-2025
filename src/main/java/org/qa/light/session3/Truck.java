package org.qa.light.session3;

public class Truck extends SmallTruck {
    public Truck(String name) {
        super(name);
    }

    public void addCargo() {

    }

    @Override
    public void goTo(String destination) {
        System.out.println("Truck drives to " + destination);
    }
}
