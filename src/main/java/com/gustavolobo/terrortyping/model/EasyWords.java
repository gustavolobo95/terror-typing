package com.gustavolobo.terrortyping.model;

import java.util.Random;
public enum EasyWords {
    TRY, ALL, FLY, WOW, LIL, MAN, ESC, PAL, YOU, VAR;

    private static final Random RANDOM = new Random();

    public static EasyWords getRandomWord() {
        int index = RANDOM.nextInt(values().length);
        return values()[index];
    }
}


