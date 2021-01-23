package com.console.utilities;

import com.console.domain.Bet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Player Inputs class
 */
public class PlayerInputs {

    /**
     * Properties
     */
    private static Integer MIN_BET_NUMBER = 1;
    private static Integer MAX_BET_NUMBER = 36;
    private static Integer betNumber;
    private static List<Bet> betList = new ArrayList<>();

    /**
     * Constructor
     */
    public PlayerInputs() {
    }

    /**
     * Methods
     */

    /**
     * Method gets user inputs for making a bet
     * Stores the inputs to a bet object
     * Store each player bet into a list of bets
     * @param names
     */
    public static void getPlayerInput(List<String> names){

        Bet playerBet = new Bet();
        Scanner scanner = new Scanner(System.in);
        int index = 0;

        index = scanner.nextInt();
        System.out.println("__________________________________");
        while (index > names.size()-1){
            System.out.println("Error! Please verify player number ");
            index = scanner.nextInt();
        }

        System.out.println("Placing bet for : " + names.get(index));
        playerBet.setPlayerName(names.get(index));
        System.out.println("________________________________");
        scanner.nextLine();

        System.out.println("Please Enter Bet : ");
        String bet = scanner.nextLine();
        getBet(playerBet, scanner, bet);

        System.out.println("Please Enter Amount : ");
        String amount = scanner.next();
        playerBet.setAmount(Double.parseDouble(getBetAmount(scanner,amount)));

        betList.add(playerBet);
    }

    /**
     * Entry method for player data capturing
     * @param scanner
     */
    public static void getBets(Scanner scanner){

        List<String> names = ReadInputFile.getPlayerNames();
        getPlayerInput(names);

        System.out.println(" Please press number 1 to bet again ");
        String click = scanner.next();

        while (!click.isEmpty()){
            System.out.println("\n____________End of Bet____________");
            System.out.println("Please select player by number ");
            System.out.println("_____________New Bet______________\n");
            getPlayerInput(names);
        }
    }

    /**
     * Method validates if bet amount input scanned is numerical
     * If amount value is not numerical it gives warning to a player, such that they capture correct input values
     * @param scanner
     * @param amount
     * @return amount
     */
    private static String getBetAmount(Scanner scanner, String amount){
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(amount);

        while (matcher.find()){
            System.out.println("Error! Amount should not contain letters, please try again : ");
            amount = scanner.next();
        }
        return amount;
    }

    /**
     * Method validates the playerBet inputs such that they right
     * @param playerBet
     * @param scanner
     * @param bet
     */
    private static void getBet(Bet playerBet ,Scanner scanner, String bet){
        if (!(bet.equalsIgnoreCase(BetOptions.EVEN.toString()) || bet.equalsIgnoreCase(BetOptions.ODD.toString()))){
            betNumber = Integer.parseInt(bet);
            while (betNumber < MIN_BET_NUMBER || betNumber > MAX_BET_NUMBER ){
                System.out.println("Please choose a number between 1 - 36 :");
                betNumber = scanner.nextInt();
            }
            bet = null;
        }

        if (bet == null){
            playerBet.setBet(betNumber.toString());
        }else {
            playerBet.setBet(bet);
        }

    }

    /**
     * Method gets list of bets
     * @return betList
     */
    public static List<Bet> getBetList() {
        return betList;
    }

}
