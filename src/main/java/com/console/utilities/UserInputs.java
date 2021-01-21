package com.console.utilities;

import java.util.List;
import java.util.Scanner;

public class UserInputs {

    private static Integer betNumber;

    public UserInputs() {
    }

    public static void getUserInput(List<String> names){

        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();
        System.out.println("Placing bet for : " + names.get(index));

        System.out.println("Please Enter Bet");
        String bet = scanner.nextLine();
        if (!(bet.equalsIgnoreCase(BetOptions.EVEN.toString()) || bet.equalsIgnoreCase(BetOptions.EVEN.toString()))){
            betNumber = Integer.parseInt(bet);
            while (betNumber < 1 || betNumber > 36 ){
                System.out.println("Please choose a number between 1 - 36 ");
                betNumber = scanner.nextInt();
            }
        }

        System.out.println("Please Enter Amount");
        String amount;
        amount = scanner.nextLine();

    }
}
