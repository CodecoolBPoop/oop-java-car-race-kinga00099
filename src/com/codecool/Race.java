package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Race {
    private static List<Vehicle> vehicles = new ArrayList<>();

    private static void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck());
        }
    }

    boolean isRaining() {
        return Weather.isRaining();
    }


    private static boolean isThereABrokenTruck() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).getBreakdownTurnsLeft() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void simulateRace() {
        for (int i = 0; i < 50; i++) {
            Weather.setRaining();
            for (Vehicle vehicle : vehicles) {
                if (vehicle instanceof Truck) {
                    if (((Truck) vehicle).getBreakdownTurnsLeft() > 0) {
                        ((Truck) vehicle).setBreakdownTurnsLeft(((Truck) vehicle).getBreakdownTurnsLeft() - 1);
                    } else {
                        ((Truck) vehicle).breakdownRoll();
                    }
                }
                if (isThereABrokenTruck()) {
                    vehicle.setMaximumSpeed(75);
                } else {
                    vehicle.setMaximumSpeed(999);
                }
                if (Weather.isRaining() && vehicle instanceof Motorcycle) {
                    Random rand = new Random();
                    int newSpeedMax = 100 - rand.nextInt(51 - 5) + 5;
                    if (newSpeedMax < vehicle.getMaximumSpeed()) {
                        vehicle.setMaximumSpeed(newSpeedMax);
                    }
                }
                vehicle.moveForAnHour(this);

            }
        }
    }


    private void printRaceResults() {
        vehicles.forEach(System.out::println);
    }

    private Race() {
        createVehicles();
    }

    public static void main(String[] args) {
        Race race = new Race();
        race.simulateRace();
        race.printRaceResults();
    }

}
