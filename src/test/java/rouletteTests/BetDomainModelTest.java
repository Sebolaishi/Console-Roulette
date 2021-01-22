package rouletteTests;

import com.console.domain.Bet;
import com.console.utilities.BetOptions;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BetDomainModelTest {

    protected static Bet playerBets;

    public BetDomainModelTest() {

    }

    protected static void capturePlayerBet(){
        playerBets = new Bet();
        playerBets.setPlayerName("Babara");
        playerBets.setBet(BetOptions.EVEN.name());
        playerBets.setAmount(45);
    }



    protected void logJunitError(String message, String methodName)
    {

        String fullMessage = "Exception in: " + getTestAndMethodName(methodName) + " - " + message;
        System.out.println(fullMessage);
        fail(fullMessage);

    }// logJunitError


    private String getTestAndMethodName(String method)
    {
        return getClass().getName() + '.' + method;
    }//


}
