package com.company.创建型.prototypeMode.core;

/**
 * @author MGARY
 * @date 2019-11-27 上午11:12
 */
public class Circle extends AbstractShape{

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
