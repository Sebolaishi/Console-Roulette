package rouletteTests;

import com.console.domain.Bet;
import com.console.utilities.BetOptions;

import static org.junit.Assert.*;

/**
 * Domain Model Test Class
 */
public class BetDomainModelTest {

    /**
     * Properties
     */
    protected static Bet playerBets;

    /**
     * Constructors
     */
    public BetDomainModelTest() {

    }

    /**
     * Methods
     */

    /**
     *Method sets bets properties data, for testing purposes
     */
    protected static void capturePlayerBet(){
        playerBets = new Bet();
        playerBets.setPlayerName("Babara");
        playerBets.setBet(BetOptions.EVEN.name());
        playerBets.setAmount(45);
    }

    /**
     * Method logs test exceptions in a formatted way
     * @param message
     * @param methodName
     */
    protected void logJunitError(String message, String methodName)
    {
        String fullMessage = "Exception in: " + getTestAndMethodName(methodName) + " - " + message;
        System.out.println(fullMessage);
        fail(fullMessage);
    }

    /**
     * Method gets the class name so that developer can know from which class did an exception occur
     * @param method
     * @return
     */
    private String getTestAndMethodName(String method)
    {
        return getClass().getName() + '.' + method;
    }

}
