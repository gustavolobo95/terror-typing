package com.gustavolobo.terrortyping.model;

import java.util.Random;

public enum MediumWords {
    LIXOS, PQUFM, JTKZR, YXVBC, DSAQW, VJNUY, PMKIL, OXERT, BHFDS, ZWMRA;

    private static final Random RANDOM = new Random();

    public static MediumWords getRandomWord() {
        int index = RANDOM.nextInt(values().length);
        return values()[index];
    }
}
