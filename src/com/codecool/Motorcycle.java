package com.codecool;

class Motorcycle extends Vehicle {
    private static int nameNumber = 0;
    private int normalSpeed = 100;

    Motorcycle() {
        setSpeed(normalSpeed);
        nameNumber++;
        setName("Motorcycle " + nameNumber);
    }
}
