package com.conversions.service;

/**
 * Conversions conversions class
 */
public class Conversions {

    /**
     * Properties
     */
    private static final float ABSOLUTE_ZERO = 273.15f;

    /**
     * Constructor
     */

    public Conversions() {
    }

    /**
     * Ktoc method converts kelvins into degrees celsius
     * @param kelvin
     * @return
     */
    private static float ktoc(float kelvin) {
        return (float) (kelvin - ABSOLUTE_ZERO);
    }
}
