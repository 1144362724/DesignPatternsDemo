package com.company.创建型.prototypeMode.core;

/**
 * @author MGARY
 * @date 2019-11-27 上午11:12
 */
public class Square extends AbstractShape{

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
