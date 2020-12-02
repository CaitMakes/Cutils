package com.caitmake.cutils;


/**
 * This class is used to add additional mathematical instructions.
 *
 * @author caitmakes
 * @since Cutils v1.0
 */
public final class Math2 {

    //Don't let anyone instantiate this class
    private Math2() {}

    /**
     * Returns {@code double} value truncated
     * to the 3 decimals.
     *
     * @param d    {@code double} value
     * @return     truncated {@code double}
     * @since Cutils v1.0
     */
    static double trunc(double d) {
        return trunc(d, 3);
    }

    /**
     * Returns {@code double} value truncated
     * to the decimal value specified.
     *
     * @param d    {@code double} value
     * @param dec  number of decimals to truncate to
     * @return     truncated {@code double}
     * @since Cutils v1.0
     */
    static double trunc(double d, int dec) {
        long w = (int)Math.floor(d);
        long pow10 = (long) Math.pow(10, dec);
        return w + ((dec == 0) ? 0 : ((int)Math.floor((d - w) * pow10)) / (double)pow10);
    }
}
