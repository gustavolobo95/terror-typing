package com.gustavolobo.terrortyping.model;

import org.apache.commons.lang3.StringUtils;

public class Player {
 private int health;
 private String partialWord;
 private int time;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getPartialWord() {
        return partialWord;
    }

    public void setPartialWord(String partialWord) {
        this.partialWord = partialWord;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void typeLetter(String letter, Robot robot) {
        String word = robot.getWord();

        if (StringUtils.isEmpty(partialWord)) {
            if (word.startsWith(letter.toUpperCase())) {
                setPartialWord(letter.toUpperCase());
            }
        } else if (word.startsWith(partialWord + letter.toUpperCase())) {
            setPartialWord(partialWord += letter.toUpperCase());
        }

    }

}
