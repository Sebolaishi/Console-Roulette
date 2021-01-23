package ConversionsTests;

import com.conversions.service.Conversions;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Conversions tests class
 */
public class ConversionsTests {

    /**
     * Properties
     */
    private static final float KELVIN_INPUT = 100;
    private static final float CELSIUS_INPUT = 100;

    /**
     * Methods
     */

    /**
     * Method executes first to initialise, and prepare necessary data
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println(" Starting Tests Execution ");
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
     * Test kelvin to celsius functionality
     */
    @Test
    public void ktocTest(){
        float celsius = Conversions.ktoc(KELVIN_INPUT);
        System.out.println("Celsius Value is : " + celsius);

        /**
         * Redundant null check because float is a primitive data type thus its never null
         * just had it for testing purpose
         */
        Assert.assertNotNull(celsius);
    }

    /**
     * Test kelvin to celsius functionality
     */
    @Test
    public void ctokTest(){
        float celsius = Conversions.ktoc(CELSIUS_INPUT);
        System.out.println("Celsius Value is : " + celsius);

        /**
         * Redundant null check because float is a primitive data type thus its never null
         * just had it for testing purpose
         */
        Assert.assertNotNull(celsius);
    }

}
