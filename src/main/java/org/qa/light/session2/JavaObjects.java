package org.qa.light.session2;

public class JavaObjects {
    /**
     * #################################
     * #################################
     * #################################
     * ####[Car@car1]###################
     * #################################
     * ######[Car@car2]#################
     * #################################
     * #################################
     * @param args
     */

    public static void main(String[] args) {
        Car.brand = "Ford";
        Car.smth();

        Car car1 = new Car("red");
        Car car2 = new Car("blue");
        Car car3 = car1;
        System.out.println(car3.color);
        System.out.println(car2.color);
        car3.goTo("Kyiv");
        car2.goTo("Odessa");
    }

    public static void paintCar(Car car, String color) {
        car.color = color;
    }
}
