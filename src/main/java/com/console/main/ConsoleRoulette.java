package com.console.main;

import com.console.utilities.ReadInputFile;
import com.console.utilities.RouletteRandomNumberGeneratorTimer;
import com.console.utilities.UserInputs;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ConsoleRoulette {

    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        Timer timer = new Timer();
        TimerTask task = new RouletteRandomNumberGeneratorTimer();

        timer.schedule(task, 2000, 5000);

        ReadInputFile.getPlayerNames();
        scanner.nextLine();

        UserInputs.getUserInput();

    }
}
