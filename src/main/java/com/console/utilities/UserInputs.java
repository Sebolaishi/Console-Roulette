package com.console.utilities;

import java.util.Scanner;

public class UserInputs {

    public static void getUserInput(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Bet And Amount");
        String bet = scanner.nextLine();
        double amount = scanner.nextDouble();

        System.out.println();
    }
}
