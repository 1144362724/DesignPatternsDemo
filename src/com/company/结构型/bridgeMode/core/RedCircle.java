package com.company.结构型.bridgeMode.core;

/**
 * @author MGARY
 * @date 2019-11-26 上午10:06
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
