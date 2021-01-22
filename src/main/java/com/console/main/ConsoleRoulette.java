package com.console.main;

import com.console.utilities.RouletteRandomNumberGeneratorTimer;
import com.console.utilities.PlayerInputs;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Main Class
 */
public class ConsoleRoulette {

    /**
     * Properties
     */
    static long THIRTY_SECONDS = 30000;

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

        PlayerInputs.getBets(scanner);
        scanner.nextLine();
    }
}
