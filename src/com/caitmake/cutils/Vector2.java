package com.caitmake.cutils;

import org.intellij.lang.annotations.MagicConstant;

@SuppressWarnings({"unused"})
public class Vector2 implements CutilConstants {
    public double x;
    public double y;

    public double angRads;
    public double angDegs;

    public Vector2() {
        this(0, 0);
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;

        this.angRads = getAngle(RADIANS);
        this.angDegs = getAngle(DEGREES);
    }

    //public Vector2(double magnitude, double angle) {

    //}


    /**
     * Gets the angle measure of the vector
     * on the 2d plane.
     * @param mode degree / radian
     * @return angle
     */

    public double getAngle(@MagicConstant(valuesFromClass = CutilConstants.class)int mode) {
        double rad = Math.atan2(this.y, this.x);
        return (mode == DEGREES) ? Math.toDegrees(rad) : rad;
    }

    public Vector2 add(Vector2 v) {
        return new Vector2(this.x + v.x, this.y + v.y);
    }

    public Vector2 add(double x, double y) {
        return new Vector2(this.x + x, this.y + y);
    }

    @Override
    public String toString() {
        return "Vector2{" +
                "(" + x +
                ", " + y +
                "), Angle: [Rads: " + Math.trunc(angRads) +
                ", Degs: " + Math.trunc(angDegs) +
                "]}";
    }
}
