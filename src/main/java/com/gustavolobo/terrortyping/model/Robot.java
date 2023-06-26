package com.gustavolobo.terrortyping.model;

import com.gustavolobo.terrortyping.logic.*;

public class Robot {

    private DificultyLevel dificultyLevel;
    private String word;
    private int time;
    private RobotBehaviorStrategy behavior;

    public Robot(DificultyLevel dificultyLevel) {
        this.dificultyLevel = dificultyLevel;
        setBehavior(dificultyLevel);
    }
    public DificultyLevel getDificultyLevel() {
        return dificultyLevel;
    }

    public void setDificultyLevel(DificultyLevel dificultyLevel) {
        this.dificultyLevel = dificultyLevel;
        setBehavior(dificultyLevel);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public RobotBehaviorStrategy getBehavior() {
        return behavior;
    }

    public void setBehavior(DificultyLevel dificultyLevel) {
        switch (dificultyLevel) {
            case EASY:
                behavior = new EasyRobotBehaviorStrategy();
                break;
            case MEDIUM:
                behavior = new MediumRobotBehaviorStrategy();
                break;
            case HARD:
                behavior = new HardRobotBehaviorStrategy();
                break;
        }
        behavior.config(this);
    }

    public void explode(Player player) {

    }

}
