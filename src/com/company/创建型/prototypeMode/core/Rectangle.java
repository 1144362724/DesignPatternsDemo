package com.company.创建型.prototypeMode.core;

/**
 * @author MGARY
 * @date 2019-11-27 上午11:12
 */
public class Rectangle extends AbstractShape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
