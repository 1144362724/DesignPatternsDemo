package com.company.创建型.abstractFactoryMode.core.square;

/**
 * @author MGARY
 * @date 2019-11-25 下午4:25
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
