package com.lyramakes.lutils;

import org.intellij.lang.annotations.MagicConstant;

@SuppressWarnings({"unused", "CommentedOutCode"})
public class Vector2 implements LutilConstants {
    public double x;
    public double y;

    public Angle angle;

    public Vector2() {
        this(0, 0);
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;

        this.angle = genAngle();
    }

    //public Vector2(double magnitude, double angle) {

    //}


    /**
     * Gets the angle measure of the vector
     * on the 2d plane.
     * @param mode degree / radian
     * @return angle
     */

    public double getAngle(@MagicConstant(valuesFromClass = LutilConstants.class)int mode) {
        double rads = Math.atan2(this.y, this.x);
        return (mode == DEGREES) ? Angle.radsToDec(rads) : rads;
    }

    public Angle genAngle() {
        return new Angle(Math.atan2(this.y, this.x), RADIANS);
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
                "), Angle: [" + angle +
                "]}";
    }
}
