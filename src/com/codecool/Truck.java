package com.codecool;

import java.util.Random;

class Truck extends Vehicle {
    private int normalSpeed = 100;
    private int breakdownTurnsLeft = 0;

    int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }


    void breakdownRoll() {
        Random random = new Random();
        if (random.nextInt(100) + 1 <= 5) {
            setBreakdownTurnsLeft(2);
            setMaximumSpeed(0);
        }
    }

    Truck() {
        setSpeed(normalSpeed);
        Random random = new Random();
        setName(String.valueOf(random.nextInt(1001)));
    }
}
