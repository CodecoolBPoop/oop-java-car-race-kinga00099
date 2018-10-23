package com.codecool;

class Vehicle {

    private int speed = 0;
    private int maximumSpeed = 999;
    private String name;
    private int distanceTraveled = 0;

    int getMaximumSpeed() {
        return maximumSpeed;
    }

    void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void moveForAnHour(Race race) {
        if (speed > maximumSpeed) {
            distanceTraveled = distanceTraveled + maximumSpeed;
        } else {
            distanceTraveled = distanceTraveled + speed;
        }
    }
}


