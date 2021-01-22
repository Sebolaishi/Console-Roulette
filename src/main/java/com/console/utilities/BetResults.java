package com.console.utilities;

import com.console.domain.Bet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BetResults {

    public BetResults() {
    }

    private static List<Bet> betList = new ArrayList<>();

    public static List<Bet> getBetsResults(Integer randomNumber){

        betList = UserInputs.getBetList();
        List<Bet> newBetList = new ArrayList<>();

         if (!betList.isEmpty()){

             Iterator<Bet> iterator = betList.iterator();
             while( iterator.hasNext()){

                 Bet bet = iterator.next();
                 Bet latestBet;
                 if(bet.getBet().equals(BetOptions.EVEN.name())){
                     latestBet = getResultsForEven(bet, randomNumber);
                 }else {
                     latestBet = getResultsForOdd(bet, randomNumber);
                 }

                 iterator.remove();
                 newBetList.add(latestBet);
             }

         }
         else {
             System.out.println("No bets at this time\n");
         }

         return newBetList;
    }

    private static Bet getResultsForEven(Bet bet, Integer randomNumber){
        Bet responseBet = Bet.copy(bet);
        if (RouletteRules.isEven(randomNumber)){
            responseBet.setAmount(RouletteRules.evenOrOddNumberWin(bet.getAmount()));
            responseBet.setOutcome(BetOutcomes.WIN.name());
        }
        else{
            responseBet.setOutcome(BetOutcomes.LOSE.name());
        }
        return  responseBet;
    }


    private static Bet getResultsForOdd(Bet bet, Integer randomNumber){
        Bet responseBet = Bet.copy(bet);
        if (!RouletteRules.isEven(randomNumber)){
            responseBet.setAmount(RouletteRules.evenOrOddNumberWin(bet.getAmount()));
            responseBet.setOutcome(BetOutcomes.WIN.name());
        }
        else{
            responseBet.setOutcome(BetOutcomes.LOSE.name());
        }
        return  responseBet;
    }


    public static List<Bet> getBetList() {
        return betList;
    }

    public static void setBetList(List<Bet> betList) {
        BetResults.betList = betList;
    }
}
