package com.console.utilities;

import com.console.domain.Bet;

import java.util.ArrayList;
import java.util.List;

/**
 * Bet Results class
 */
public class BetResults {

    /**
     * Properties
     */
    private static List<Bet> betList = new ArrayList<>();
    private static double value;

    /**
     * Constructors
     */
    public BetResults() {
    }

    /**
     * Method iterates through a list of bets to prepare results
     * @param randomNumber
     * @return newBetList
     */
    public static List<Bet> getBetsResults(Integer randomNumber){

        betList = PlayerInputs.getBetList();
        List<Bet> newBetList = new ArrayList<>();

         if (!betList.isEmpty()){

             betList.forEach(bet -> {
                 if(bet.getBet().equals(BetOptions.EVEN.name())){
                     getResultsForEven(bet, randomNumber);
                 }else if (bet.getBet().equals(BetOptions.ODD.name())) {
                     getResultsForOdd(bet, randomNumber);
                 }else{
                     getResultsForBonusNumber(bet, randomNumber);
                 }

                 newBetList.add(bet);
             });
         }
         else {
             System.out.println("No bets at this time\n");
         }

         return newBetList;
    }

    /**
     * Method handles even random number and even bet results
     * @param bet
     * @param randomNumber
     */
    private static void getResultsForEven(Bet bet, Integer randomNumber){
        if (RouletteRules.isEven(randomNumber)){
            bet.setAmount(RouletteRules.evenOrOddNumberWin(bet.getAmount()));
            bet.setOutcome(BetOutcomes.WIN.name());
        }
        else{
            bet.setAmount(value);
            bet.setOutcome(BetOutcomes.LOSE.name());
        }
    }

    /**
     * Method handles random number match winnings
     * @param bet
     */
    private static void getResultsForBonusNumber(Bet bet, Integer randomNumber){
        if (Integer.parseInt(bet.getBet()) == randomNumber){
            bet.setAmount(RouletteRules.bonusWin(bet.getAmount()));
            bet.setOutcome(BetOutcomes.WIN.name());
        }else {
            bet.setAmount(value);
            bet.setOutcome(BetOutcomes.LOSE.name());
        }

    }

    /**
     * Method handles odd random number and odd bet results
     * @param bet
     * @param randomNumber
     */
    private static void getResultsForOdd(Bet bet, Integer randomNumber) {
        if (!RouletteRules.isEven(randomNumber)) {
            bet.setAmount(RouletteRules.evenOrOddNumberWin(bet.getAmount()));
            bet.setOutcome(BetOutcomes.WIN.name());
        } else {

            bet.setAmount(value);
            bet.setOutcome(BetOutcomes.LOSE.name());
        }
    }

    /**
     *Getters and Setters
     */
    public static List<Bet> getBetList() {
        return betList;
    }

    public static void setBetList(List<Bet> betList) {
        BetResults.betList = betList;
    }
}
