package com.console.domain;

import java.io.Serializable;

/**
 * Bets Object Model
 */
public class Bet implements Serializable {

    /**
     * Properties
     */
    private String playerName;
    private String bet;
    private double amount;
    private String outcome;

    /**
     * Constructors
     */
    public Bet() {
    }

    /**
     *
     * @param playerName
     * @param bet
     * @param amount
     * @param outcome
     */
    public Bet(String playerName, String bet, double amount, String outcome) {
        this.playerName = playerName;
        this.bet = bet;
        this.amount = amount;
        this.outcome = outcome;
    }

    /**
     * Methods
     */

    /**
     * Method makes a copy of the selected bet for purposes of iteration
     * @param contextBet
     * @return
     */
    public static Bet copy( Bet contextBet) {
        return  new Bet( contextBet.getPlayerName(), contextBet.getBet(), contextBet.getAmount(), contextBet.getOutcome());
    }

    /**
     * Getters and Setters
     * @return
     */

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
