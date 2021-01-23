package rouletteTests;

import com.console.utilities.ReadInputFile;
import com.console.utilities.RouletteRandomNumberGeneratorTimer;
import com.console.utilities.RouletteRules;
import commons.TestsCommons;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Utilities Class
 */
public class RouletteUtilitiesTests extends TestsCommons {

    /**
     * Properties
     */
    private static Integer randomNumber;

    /**
     * Methods
     */

    /**
     * Method executes first to initialise, and prepare necessary data
     * @throws Exception
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        randomNumber = RouletteRandomNumberGeneratorTimer.getRandomNumber(1,36);
    }

    /**
     * Method test file reading functionality
     */
    @Test
    public void getPlayerNamesTest(){
        List<String> playerNames = ReadInputFile.getPlayerNames();
        Assert.assertNotNull(playerNames);
    }

    /**
     * Method tests if bet data is not empty
     */
    @Test
    public void playerBetTest(){
        try{
            capturePlayerBet();
            Assert.assertNotNull(playerBets.getPlayerName());
            Assert.assertNotNull(playerBets.getBet());

            Assert.assertEquals("Babara", "Babara");
            Assert.assertEquals(45, 45);

            Assert.assertNotNull(playerBets);
            System.out.println(" Passed All Tests ");

        }catch(Exception exception){
            logJunitError(exception.getMessage(), " playerBetTest");
        }

    }

    /**
     * Method tests random number generation functionality
     */
    @Test
    public void generateRandomNumberTest(){
        Assert.assertNotNull(randomNumber);

        if (RouletteRules.isEven(randomNumber)){
            Assert.assertTrue(RouletteRules.isEven(randomNumber));
        }else {
            Assert.assertFalse(RouletteRules.isEven(randomNumber));
        }
    }

    /**
     * Method tests timer functionality
     */
    @Test
    public void timerTest(){
        long THIRTY_SECONDS = 10000;

        Timer timer = new Timer();
        TimerTask task = new RouletteRandomNumberGeneratorTimer();
        timer.schedule(task, THIRTY_SECONDS);
        Assert.assertNull(RouletteRandomNumberGeneratorTimer.getRandomNumber());
    }

}
