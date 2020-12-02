package com.caitmake.cutils;

import org.intellij.lang.annotations.MagicConstant;

public class Angle implements CutilConstants {
    public double measure;
    private int mode;

    public Angle() {
        measure = 0;
        mode = DEGREES;
    }

    public Angle(double measure, @MagicConstant(valuesFromClass = CutilConstants.class)int mode) {

    }

}
