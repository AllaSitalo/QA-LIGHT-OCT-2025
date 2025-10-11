package org.qa.light.session3;

public class Plane {

    public void flyTo(String destination) {
        System.out.println("Plane flies to " + destination);
    }

    public void boardPassenger(String passengerName) {
        int seatNumber = 999;
        boardPassenger(passengerName, seatNumber);
    }

    public void boardPassenger(String passengerName, int seatNumber) {
        boardPassenger(passengerName, seatNumber, false);
    }

    public void boardPassenger(String passengerName, int seatNumber, boolean businessClass) {
        if (businessClass) {
            System.out.println("Passenger " + passengerName + " sits on " + seatNumber + " in business class");
        } else {
            System.out.println("Passenger " + passengerName + " sits on " + seatNumber + " in common area");
        }
    }

    public void schedulePlane(int seatNumber, String passengerName) {
    }

    public int countPassengers() {
        return 10;
    }

    public String getFlightId() {
        return "AA12345";
    }
}
