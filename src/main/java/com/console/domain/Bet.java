package com.console.domain;

import java.io.Serializable;

public class Bet implements Serializable {

    private String playerName;

    private String bet;

    private double amount;

    private String outcome;

    public Bet() {
    }

    public Bet(String playerName, String bet, double amount, String outcome) {
        this.playerName = playerName;
        this.bet = bet;
        this.amount = amount;
        this.outcome = outcome;
    }

    public static Bet copy( Bet contextBet) {
        return  new Bet( contextBet.getPlayerName(), contextBet.getBet(), contextBet.getAmount(), contextBet.getOutcome());
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getBet() {
        return bet;
    }

    public void setBet(String bet) {
        this.bet = bet;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "playerName='" + playerName + '\'' +
                ", bet='" + bet + '\'' +
                ", amount=" + amount +
                '}';
    }
}
