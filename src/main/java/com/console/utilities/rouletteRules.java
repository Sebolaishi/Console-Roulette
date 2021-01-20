package com.console.utilities;

public class rouletteRules {

    private static int BONUS_WIN = 36;
    private static int EVEN = 2;
    private static int ODD = 3;

    public rouletteRules() {
    }

    public static double bonusWin(int betAmount){
        return BONUS_WIN*betAmount;
    }

    public static double evenNumberWin(int betAmount){
        return EVEN*betAmount;
    }

    public static double oddNumberWin(int betAmount){
        return ODD*betAmount;
    }

    public static boolean isEven(int betNumber){
        return betNumber%2 == 0 ? Boolean.TRUE : Boolean.FALSE;
    }

}
