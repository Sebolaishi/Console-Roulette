package com.console.utilities;

import java.util.Scanner;

public class UserInputs {

    private static Integer betNumber= null;

    public UserInputs() {
    }

    public static void getUserInput(){

        Scanner scanner = new Scanner(System.in);

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
        double amount;
        try{
            amount = scanner.nextDouble();
        }catch (Exception exception){
            System.out.println("Error :" + exception.getMessage());
            System.out.println("Please choose a number between 1 - 36 ");
            amount = scanner.nextDouble();
        }


    }
}
