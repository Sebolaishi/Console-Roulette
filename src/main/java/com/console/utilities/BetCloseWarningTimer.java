package com.console.utilities;

import java.util.TimerTask;

/**
 *  BetCloseWarningTimer class
 */
public class BetCloseWarningTimer extends TimerTask {

    /**
     * Timer method executor
     */
    @Override
    public void run() {
        System.out.println("Bet Closing in 5 Seconds time");
    }
}
