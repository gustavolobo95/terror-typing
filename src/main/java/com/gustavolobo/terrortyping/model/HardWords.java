package com.gustavolobo.terrortyping.model;

import java.util.Random;

public enum HardWords {
    GHTYWZK, XJPMQRC, LBNVXSD, UYHDAOP, RYQMJNK, FCIVELT, ZBXGORU, NDWSAFY, QOPKJER, VYXTUMS;

    private static final Random RANDOM = new Random();

    public static HardWords getRandomWord() {
        int index = RANDOM.nextInt(values().length);
        return values()[index];
    }
}
