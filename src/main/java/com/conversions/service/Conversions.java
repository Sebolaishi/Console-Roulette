package com.conversions.service;

/**
 * Conversions conversions class
 */
public class Conversions {

    /**
     * Properties
     */
    private static final float ABSOLUTE_ZERO = 273.15f;
    private static final double KM_CONVERTOR = 1.609;

    /**
     * Constructor
     */

    public Conversions() {
    }

    /**
     * Methods
     */

    /**
     *The ktoc endpoint method should produce an output amount in celsius when given an input amount in kelvin.
     * @param kelvin
     * @return
     */
    private static float ktoc(float kelvin) {
        return (float) (kelvin - ABSOLUTE_ZERO);
    }

    /**
     * The ctok endpoint method should produce an output amount in kelvin when given an input amount in celsius.
     * @param celsius
     * @return
     */
    private static float ctoc(float celsius) {
        return (float) (celsius + ABSOLUTE_ZERO);
    }

    /**
     * The mtok endpoint method should produce, when given an input amount in miles, an output amount in kilometers.
     * @param miles
     * @return
     */
    private static double mtok(double miles){
        return KM_CONVERTOR * miles;
    }

    /**
     * The ktom endpoint method should produce, when given an input amount in kilometers, an output amount in miles.
     * @param kilometer
     * @return
     */
    static double ktom(double kilometer){
        return kilometer/KM_CONVERTOR;
    }
}
