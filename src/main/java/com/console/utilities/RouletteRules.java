package com.console.utilities;

/**
 * Roulette Rules class
 */
public class RouletteRules {

    /**
     * Properties
     */
    private static int BONUS_WIN = 36;
    private static int EVEN_OR_ODD = 2;

    /**
     * Constructors
     */
    public RouletteRules() {
    }

    /**
     * Methods
     */

    /**
     * Method calculates random number match win
     * @param betAmount
     * @return
     */
    public static double bonusWin(double betAmount){
        return BONUS_WIN*betAmount;
    }

    /**
     * * Method calculates even or odd number win
     * @param betAmount
     * @return
     */
    public static double evenOrOddNumberWin(double betAmount){
        return EVEN_OR_ODD*betAmount;
    }

    /**
     * Method checks if random number is Even or Odd
     * @param betNumber
     * @return
     */
    public static boolean isEven(int betNumber){
        return betNumber%2 == 0 ? Boolean.TRUE : Boolean.FALSE;
    }

}
