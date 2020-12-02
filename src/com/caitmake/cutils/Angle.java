package com.caitmake.cutils;

import org.intellij.lang.annotations.MagicConstant;

import java.util.Objects;

public class Angle implements CutilConstants {
    public double measure;
    private int mode;

    public Angle() {
        measure = 0;
        mode = DEGREES;
    }

    public Angle(double m, @MagicConstant(valuesFromClass = CutilConstants.class)int t) {
        measure = (t == RADIANS) ? m : Math.toRadians(m);
        mode = t;
    }

    public double getMeasure(@MagicConstant(valuesFromClass = CutilConstants.class)int t) {
        return (mode == DEGREES) ? radsToDec(measure) : measure;
    }

    public int convert() {
        mode = (mode == DEGREES) ? RADIANS : DEGREES;
        return mode;
    }

    public static double radsToDec(double angrads) {
        return angrads * (180.0 / Math.PI);
    }

    // -- Universal Overrides --

    @Override
    public String toString() {
        return "Angle[" +
                "Degrees: " + radsToDec(measure) +
                ", Radians: " + measure +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Angle angle = (Angle) o;
        return Double.compare(angle.measure, measure) == 0 &&
                mode == angle.mode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measure, mode);
    }
}
