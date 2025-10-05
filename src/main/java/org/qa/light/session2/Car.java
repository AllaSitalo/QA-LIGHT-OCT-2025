package org.qa.light.session2;

public class Car {

    public static String brand;

    public String color;

    public Car(String color) {
        this.color = color;
    }

    public void goTo(String destination) {
        System.out.println(color + " " + brand + " car goes " + destination);
    }

    public static void smth() {
        System.out.println("static smth");
    }
}
