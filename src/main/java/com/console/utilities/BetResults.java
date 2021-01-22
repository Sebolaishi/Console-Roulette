package com.console.utilities;

import com.console.domain.Bet;

import java.util.ArrayList;
import java.util.List;

public class BetResults {

    public BetResults() {
    }

    private static List<Bet> betList = new ArrayList<>();

    public static void getBetsResults(Integer randomNumber){

        betList = UserInputs.getBetList();

        betList.forEach(bet -> {
            if(bet.getBet().equals(BetOptions.EVEN.name())){
                getResultsForEven(bet, randomNumber);
            }else {
                getResultsForOdd(bet, randomNumber);
            }

            betList.add(bet);
        });

    }

    private static void getResultsForEven(Bet bet, Integer randomNumber){
        if (RouletteRules.isEven(randomNumber)){
            bet.setAmount(RouletteRules.evenOrOddNumberWin(bet.getAmount()));
            bet.setOutcome(BetOutcomes.WIN.name());
        }
        else{
            bet.setOutcome(BetOutcomes.LOSE.name());
        }
    }

    private static void getResultsForOdd(Bet bet, Integer randomNumber){

        if (!RouletteRules.isEven(randomNumber)){
            bet.setAmount(RouletteRules.evenOrOddNumberWin(bet.getAmount()));
            bet.setOutcome(BetOutcomes.WIN.name());
        }
        else{
            bet.setOutcome(BetOutcomes.LOSE.name());
        }
    }


    public static List<Bet> getBetList() {
        return betList;
    }

    public static void setBetList(List<Bet> betList) {
        BetResults.betList = betList;
    }
}
