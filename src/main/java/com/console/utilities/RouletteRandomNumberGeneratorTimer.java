package com.console.utilities;

import com.console.domain.Bet;

import java.util.Date;
import java.util.List;
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
        System.out.println( "Random Number : " + randomNumber + "\n");
        List<Bet> playerBets = BetResults.getBetsResults(randomNumber);

        System.out.println("\n-----------------------------------------" + "\n\t\t\t Bet Results");
        System.out.println("-----------------------------------------");

        System.out.println("Number : " + randomNumber);
        System.out.println("Player" + "\tBet" + "\tOutcome" + "\tWinnings");
        playerBets.forEach(bet -> {
            System.out.println(bet.getPlayerName() + "\t" + bet.getBet() + "\t" + bet.getOutcome() + "\t" + bet.getAmount());
        });

        System.out.println("\n-------------------END-------------------\n");
        System.out.println("Stopping App.");
        System.exit(0);
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
