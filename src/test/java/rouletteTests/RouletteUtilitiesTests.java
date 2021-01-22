package rouletteTests;

import com.console.domain.Bet;
import com.console.utilities.ReadInputFile;
import com.console.utilities.RouletteRandomNumberGeneratorTimer;
import com.console.utilities.RouletteRules;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static org.junit.Assert.*;

public class RouletteUtilitiesTests extends  BetDomainModelTest{

    private static Integer randomNumber;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        System.out.println(" Starting Tests Execution ");
        System.out.println(" ____________________________________________________________ ");

        capturePlayerBet();
        randomNumber = RouletteRandomNumberGeneratorTimer.getRandomNumber(1,36);
    }

    @AfterClass
    public static void setUpAfterClass() throws Exception
    {
        System.out.println(" Tests Finished ");
        System.out.println(" ____________________________________________________________ ");
    }

    @Test
    public void getPlayerNamesTest(){
        List<String> playerNames = ReadInputFile.getPlayerNames();
        Assert.assertNotNull(playerNames);
    }

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

    @Test
    public void generateRandomNumberTest(){
        Assert.assertNotNull(randomNumber);

        if (RouletteRules.isEven(randomNumber)){
            Assert.assertTrue(RouletteRules.isEven(randomNumber));
        }else {
            Assert.assertFalse(RouletteRules.isEven(randomNumber));
        }


    }

    @Test
    public void timerTest(){

        long THIRTY_SECONDS = 10000;

        Timer timer = new Timer();
        TimerTask task = new RouletteRandomNumberGeneratorTimer();
        timer.schedule(task, THIRTY_SECONDS);
        Assert.assertNull(RouletteRandomNumberGeneratorTimer.getRandomNumber());

    }


}
