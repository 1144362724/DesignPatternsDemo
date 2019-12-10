package com.company.结构型.decoratorMode.core;

/**
 * @author MGARY
 * @date 2019-11-25 下午4:25
 */
public abstract class ShapeDecorator implements Shape {

    Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
