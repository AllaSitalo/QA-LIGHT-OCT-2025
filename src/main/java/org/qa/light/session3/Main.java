package org.qa.light.session3;

import org.qa.light.session2.Car;

//TODO: create interface IPhone, which can call(), unlockScreen(), blockScreen()
//TODO: create classes IOS and Android which implement IPhone
//TODO: unlock, make call, lock screen for both phones

public class Main {

    public static void main(String[] args) {
        Ford f = new Ford();
        Mazda m = new Mazda();

        testDrive(f);
        testDrive(m);

        Car.brand = "Toyota";
//        CrossOver crossOver = new CrossOver("green");
//        crossOver.goTo("Odessa");
        Car car = new Car("blue");
        SmallTruck smallTruck = new SmallTruck("test");
        Truck truck = new Truck("red");
        BigTruck bigTruck = new BigTruck("test");
        car.goTo("Odessa");
        smallTruck.goTo("Odessa");
        truck.goTo("Kharkiv");
        bigTruck.goTo("Kharkiv");

        //        smallTruck.addSmallCargo();
//        truck.addSmallCargo();
//        truck.addCargo();

//        bigTruck.addSmallCargo();
//        bigTruck.addCargo();
//        bigTruck.addBigCargo();

//        Plane plane = new Plane();
//        plane.boardPassenger("Tom");
//        plane.boardPassenger("Jerry", 10);
//        plane.boardPassenger("Pit", 5, true);
//
//        int count = plane.countPassengers();
//        System.out.println("Passenger count : " + count);
    }

    public static void testDrive(ICar car) {
        car.drive();
        car.turnLeft();
        car.drive();
        car.turnRight();
    }
}
