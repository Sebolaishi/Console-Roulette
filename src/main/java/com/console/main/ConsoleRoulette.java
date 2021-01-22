package com.console.main;

import com.console.utilities.ReadInputFile;
import com.console.utilities.RouletteRandomNumberGeneratorTimer;
import com.console.utilities.UserInputs;

import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ConsoleRoulette {

    static long THIRTY_SECONDS = 10000;

    /**
     * Application entry point starts here.
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("App started!");

        Timer timer = new Timer();
        TimerTask task = new RouletteRandomNumberGeneratorTimer();
        timer.schedule(task, THIRTY_SECONDS);

        List<String> names = ReadInputFile.getPlayerNames();
        UserInputs.getUserInput(names);

        scanner.nextLine();


    }
}
