package com.console.utilities;

import java.util.Date;
import java.util.Random;
import java.util.TimerTask;

public class RouletteRandomNumberGeneratorTimer extends TimerTask {

    public static Integer MIN_BET_NUMBER = 1;
    public static Integer MAX_BET_NUMBER = 36;

    private static Integer randomNumber;

    public RouletteRandomNumberGeneratorTimer() {
    }

    @Override
    public void run() {
        randomNumber = getRandomNumber(MIN_BET_NUMBER, MAX_BET_NUMBER);
        setRandomNumber(randomNumber);
        System.out.println( "Landed Random Number : " + randomNumber);
        BetResults.getBetsResults(randomNumber);
        System.out.println("Stopping App.");
        //System.exit(0);
    }

    public static int getRandomNumber(int min, int max){
        Random random = new Random();
        return  random.ints(min,(max + 1)).findFirst().getAsInt();
    }

    public static void setRandomNumber(Integer randomNumber) {
        RouletteRandomNumberGeneratorTimer.randomNumber = randomNumber;
    }

    public static Integer getRandomNumber() {
        return randomNumber;
    }
}
