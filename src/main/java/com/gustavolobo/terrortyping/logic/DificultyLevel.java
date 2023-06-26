package com.gustavolobo.terrortyping.logic;

import java.util.Random;

public enum DificultyLevel {
    EASY, MEDIUM, HARD;

    private static final Random RANDOM = new Random();

    public static DificultyLevel getRandomDificulty() {
        int index = RANDOM.nextInt(values().length);
        return values()[index];
    }
}
