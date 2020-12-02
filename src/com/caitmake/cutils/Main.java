package com.caitmake.cutils;

public class Main {

    public static void main(String[] args) {
        Vector2 v = new Vector2(3, 4);
        double theta = v.getAngle(CutilConstants.DEGREES);
        System.out.println(theta);
        System.out.println(v);

        System.out.println(Math.trunc(1234.56789, 2));
        System.out.println(Math.trunc(1234.56789, 0));
        System.out.println(Math.trunc(1234.56789, 4));
    }
}


//class GUI extends JFrame {
//
//}