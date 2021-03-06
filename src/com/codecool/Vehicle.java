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

    void setName(String name) {
        this.name = name;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void moveForAnHour(Race race) {
        if (speed > maximumSpeed) {
            distanceTraveled = distanceTraveled + maximumSpeed;
        } else {
            distanceTraveled = distanceTraveled + speed;
        }
    }

    @Override
    public String toString() {
        StringBuilder vehicleAttributes = new StringBuilder("{type: ")
                .append(getClass().getSimpleName())
                .append(", ")
                .append("name: ")
                .append(name)
                .append(", ")
                .append("distance travelled: ")
                .append(distanceTraveled)
                .append("}");
        return vehicleAttributes.toString();
    }
}


