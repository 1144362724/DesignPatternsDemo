package com.company.结构型.bridgeMode.core;

/**
 * 普通单例模式
 * @author MGARY
 * @date 2019-11-26 上午10:06
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
