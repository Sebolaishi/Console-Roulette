package com.console.utilities;

import com.console.domain.Bet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputs {

    private static Integer betNumber;

    private static List<Bet> betList = new ArrayList<>();

    public UserInputs() {
    }

    public static void getUserInput(Scanner scanner, List<String> names){

        Bet playerBet = new Bet();

        int index = 0;

        index = scanner.nextInt();
        System.out.println("__________________________________");
        while (index > names.size()-1){
            System.out.println("Error! Please verify player number ");
            index = scanner.nextInt();
        }

        System.out.println("Placing bet for : " + names.get(index));
        playerBet.setPlayerName(names.get(index));
        System.out.println("__________________________________");
        scanner.nextLine();

        System.out.println("Please Enter Bet : ");
        String bet = scanner.nextLine();
        getBet(playerBet, scanner, bet);

        System.out.println("Please Enter Amount : ");
        String amount = scanner.next();
        playerBet.setAmount(Double.parseDouble(getBetAmount(scanner,amount)));

        betList.add(playerBet);

    }

    public static void getBets(Scanner scanner){
        List<String> names = ReadInputFile.getPlayerNames();
        getUserInput(scanner, names);

        System.out.println(" Please press number 1 to bet again ");
        String click = scanner.next();
        if (!click.isEmpty()){
            System.out.println("Please select player by number ");
            getUserInput(scanner, names);
        }
    }

    private static String getBetAmount(Scanner scanner, String amount){
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(amount);

        while (matcher.find()){
            System.out.println("Error! Amount should not contain letters, please try again : ");
            amount = scanner.next();
        }
        return amount;
    }

    private static void getBet(Bet playerBet ,Scanner scanner, String bet){
        if (!(bet.equalsIgnoreCase(BetOptions.EVEN.toString()) || bet.equalsIgnoreCase(BetOptions.ODD.toString()))){
            betNumber = Integer.parseInt(bet);
            while (betNumber < 1 || betNumber > 36 ){
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

    public static List<Bet> getBetList() {
        return betList;
    }

}
