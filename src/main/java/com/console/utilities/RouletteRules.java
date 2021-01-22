package com.console.utilities;

public class RouletteRules {

    private static int BONUS_WIN = 36;
    private static int EVEN_OR_ODD = 2;

    public RouletteRules() {
    }

    public static double bonusWin(int betAmount){
        return BONUS_WIN*betAmount;
    }

    public static double evenOrOddNumberWin(double betAmount){
        return EVEN_OR_ODD*betAmount;
    }

    public static boolean isEven(int betNumber){
        return betNumber%2 == 0 ? Boolean.TRUE : Boolean.FALSE;
    }

}
