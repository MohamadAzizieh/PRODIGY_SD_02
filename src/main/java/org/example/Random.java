package org.example;

public class Random {

    private final int randomNum;

    public Random(){
        this.randomNum = (int) (Math.random() * 1000000 + 1); // generates a random number between 1 & 1,000,000
    }

    public int getRandomNum(){
        return this.randomNum;
    }
}
