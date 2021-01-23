package com.console.utilities;

import com.console.domain.Bet;

import java.util.List;
import java.util.Random;
import java.util.TimerTask;

/**
 * Random Number Generator Timer Class
 */
public class RouletteRandomNumberGeneratorTimer extends TimerTask {

    /**
     * Properties
     */
    public static Integer MIN_BET_NUMBER = 1;
    public static Integer MAX_BET_NUMBER = 36;
    private static Integer randomNumber;

    /**
     * Constructors
     */
    public RouletteRandomNumberGeneratorTimer() {
    }

    /**
     * Timer executor method
     */
    @Override
    public void run() {
        randomNumber = getRandomNumber(MIN_BET_NUMBER, MAX_BET_NUMBER);
        List<Bet> playerBets = BetResults.getBetsResults(randomNumber);

        System.out.println("\n********************************************" + "\n\t Bet round closed, check results below");
        System.out.println("********************************************");

        if (!playerBets.isEmpty()){
            System.out.println("\n-----------------------------------------" + "\n\t\t\t Bet Results");
            System.out.println("-----------------------------------------");

            System.out.println("Number : " + randomNumber);
            System.out.println("Player" + "\t\tBet" + "\t\tOutcome" + "\t\tWinnings");
            playerBets.forEach(bet -> {
                System.out.println(bet.getPlayerName() + "\t\t" + bet.getBet() + "\t\t" + bet.getOutcome() + "\t\t" + bet.getAmount());
            });
            System.out.println("\n-------------------END-------------------\n");
        }

        System.out.println("Stopping App.\n");
        System.exit(0);
    }

    /**
     * Random number generator method
     * @param min
     * @param max
     * @return
     */
    public static int getRandomNumber(int min, int max){
        Random random = new Random();
        return  random.ints(min,(max + 1)).findFirst().getAsInt();
    }

    /**
     * Getter and Setter
     * @return
     */

    public static void setRandomNumber(Integer randomNumber) {
        RouletteRandomNumberGeneratorTimer.randomNumber = randomNumber;
    }

    public static Integer getRandomNumber() {
        return randomNumber;
    }
}
