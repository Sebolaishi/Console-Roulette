package commons;

import com.console.domain.Bet;
import com.console.utilities.BetOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.fail;

/**
 * TestsCommons Class
 */
public class TestsCommons {

    /**
     * Properties
     */
    protected static Bet playerBets;

    /**
     * Constructors
     */
    public TestsCommons() {
    }

    /**
     * Methods
     */

    /**
     * Method executes first to initialise, and prepare necessary data
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println(" \n Starting Tests Execution ");
        System.out.println(" ____________________________________________________________\n ");
    }

    /**
     * Method runs last after all tests execute to print on console the message
     */
    @AfterClass
    public static void setUpAfterClass()
    {
        System.out.println("\nTests Finished ");
        System.out.println(" ____________________________________________________________\n ");
    }

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
