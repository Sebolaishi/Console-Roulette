package com.console.utilities;

import com.console.domain.Bet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputs {

    private static Integer betNumber;

    public UserInputs() {
    }

    public static void getUserInput(List<String> names){
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Bet playerBet = new Bet();
        List<Bet> betList = new ArrayList<>();

        int index = 0;
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Please Enter Amount : ");
        String amount = scanner.next();
        Matcher matcher = pattern.matcher(amount);

        while (matcher.find()){
            System.out.println("Error! Amount should not contain letters, please try again : ");
            amount = scanner.next();
        }

        playerBet.setAmount(Double.parseDouble(amount));
        betList.add(playerBet);

    }
}
