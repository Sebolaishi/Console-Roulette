package com.console.main;

import com.console.utilities.ReadInputFile;
import com.console.utilities.UserInputs;

import java.util.Scanner;

public class ConsoleRoulette {

    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        ReadInputFile.getPlayerNames();


        scanner.nextLine();

        UserInputs.getUserInput();

    }
}
