package com.codecool;

import java.util.Random;

class Car extends Vehicle {
    private static final String[] carNames = {
            "Tracer",
            "Cosmos",
            "Guardian",
            "Lioness",
            "Daydream",
            "Dynamo",
            "Hollo",
            "Fire",
            "Millenium",
            "Dynamo"
    };

    Car() {
        Random random = new Random();
        setSpeed(random.nextInt(111 - 80) + 80);
        setName(carNames[random.nextInt(8)] + " " + carNames[random.nextInt(8)]);
    }
}
