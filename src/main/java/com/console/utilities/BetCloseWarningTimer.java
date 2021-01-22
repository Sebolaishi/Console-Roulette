package com.console.utilities;

import java.util.TimerTask;

public class BetCloseWarningTimer extends TimerTask {


    @Override
    public void run() {
        System.out.println("Bet Closing in 5 Seconds time");
    }
}
