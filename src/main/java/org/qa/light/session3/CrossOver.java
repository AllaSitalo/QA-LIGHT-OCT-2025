package org.qa.light.session3;

import org.qa.light.session2.Car;

public class CrossOver extends Car {

    /**
     * CrossOver extends Car
     * new CrossOver:
     * 1. new Car
     * 2. new CrossOver
     * @param color
     */

    public CrossOver(String color) {
        super(color);
        if (Car.brand != null) {
            switchToAWD();
        }
    }

    private void switchToAWD(){
        if (Car.brand.equals("Mercedes")) {
            System.out.println("Switching to AWD");
        } else {
            System.out.println("Not Switching to AWD");
        }
    }
}
