package com.codecool;

import java.util.Random;

class Weather {
    private static boolean isRaining = false;

    static void setRaining() {
        Random randomNumber = new Random();
        isRaining = randomNumber.nextInt(100) + 1 <= 30;
    }

    static boolean isRaining() {
        return isRaining;
    }
}
